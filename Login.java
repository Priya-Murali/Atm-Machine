package atmproject;
import java.util.Scanner;
class Login
{
    int ac_number = 3161;
    int ac_pass = 7830;
    int ac, pw;
    public void acceptInput()
    {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Bank Account Number: ");
        ac = scanner.nextInt();
        System.out.print("Enter your Atm Pin/password: ");
        pw = scanner.nextInt();
    }
    public void verify() throws Exception
    {   
        if(ac == ac_number && pw == ac_pass)
        {
            System.out.println("----------------------------------------------");
            System.out.println("Your Account has been Login Successfully !");
            System.out.println("----------------------------------------------");
            Account b;
            b = new Account();
            System.out.println(" ");
            System.out.println(" ");
            Menu m1 = new Menu();
            m1.showMenu();
        }
        else
        {
            Invalid_transaction loginfailed = new Invalid_transaction("Incorrect Login Credentials !");
            System.out.println(loginfailed.getMessage());
            throw loginfailed;
        }
    }
}
