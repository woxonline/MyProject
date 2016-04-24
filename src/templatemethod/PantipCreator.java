package templatemethod;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import templatemethod.AccountCreator;

public class PantipCreator extends AccountCreator {
    @Override
        public void InsertPersonalId(){
        System.out.println("Please Insert Your Id Card : ");
        String IdCard = Sc.next();
        try{
            if(IdCard.length()==13){ 
                File file = new File("IDCard[Pantip].txt");
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(IdCard);
                bw.newLine();
                bw.close();           
        }else{
            System.out.println("Please Try again check for sure you insert correct Id Card Number : ");
            this.InsertPersonalId();
        } 
        }catch(Exception e){
            System.out.println("Error");
        }  
    }
}
