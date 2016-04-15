package templatemethod;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public abstract class AccountCreator {
    Scanner Sc = new Scanner(System.in);
    public void Hello(){
        System.out.println("###Register Form###");
    }
    public void InsertId(){
        System.out.println("Please Input Your Id : ");
        String Id = Sc.nextLine();
        try{                    
            File file = new File("Id.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Id);
            bw.newLine();
            bw.close();
        }catch(Exception E){
            System.out.println("Error");
        }
    }
    public void InsertPwd(){
        System.out.println("Please Input Your Password : ");
        String Pwd = Sc.nextLine();
        try{                    
            File file = new File("Password.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Pwd);
            bw.newLine();
            bw.close();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    public void InsertName(){
        System.out.println("Please Insert Your Name : ");
        String Name = Sc.nextLine();
        try{                    
            File file = new File("Name.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Name);
            bw.newLine();
            bw.close();
        }catch(Exception e){
            System.out.println("Error");
        }    
    }
    public void InsertEmail(){
        System.out.println("Please Insert Your Email : ");
        String Email = Sc.nextLine();
        try{                    
            File file = new File("Email.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Email);
            bw.newLine();
            bw.close();
        }catch(Exception e){
            System.out.println("Error");
        }    
    }
    public void InsertPersonalId(){
        System.out.println("Please Insert Your Id Card : ");
        String IdCard = Sc.next();
        try{
            if(IdCard.length()==13){ 
                File file = new File("IDCard.txt");
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
    public void InsertMobilenumber(){
        System.out.println("Please Insert Your Mobile Number : ");
        String MobileNumber = Sc.nextLine();
        try{
            if(MobileNumber.length()==10){
                File file = new File("MobileNumber.txt");
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(MobileNumber);
                bw.newLine();
                bw.close();
            }else{
                System.out.println("Please Insert Mobile Number 10 Integer !!");
                this.InsertMobilenumber();
            }

        }catch(Exception e){
            System.out.println("Error");
        }    
    }
    public void CreatorAccount(){
        this.Hello();
        this.InsertId();
        this.InsertPwd();
        this.InsertName();
        this.InsertEmail();
        this.InsertPersonalId();
        this.InsertMobilenumber();
    }
}
