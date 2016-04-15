package templatemethod;
// Author By Thiti Kitiwakul

public class TemplateMethod {
    public static void main(String[] args) {
        AccountCreator pc = new PantipCreator();
        AccountCreator fc = new FacebookCreator();
        pc.CreatorAccount();
        fc.CreatorAccount();
    }
}
