package atmproject;
public class Atm_app 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("*******************************************************");
        System.out.println("Welcome to my ATM !Insert your card please....!");
        System.out.println("********************************************************");
        Account b = new Account();
        b.initiate();
    }
}
