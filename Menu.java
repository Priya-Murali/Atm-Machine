package atmproject;
import java.util.Scanner;
class Menu
{
    int selectedOption;
    Account b = new Account();
    public void showMenu()
    {
        System.out.println("*******************************************************");
        System.out.println("Please Select an option below:");
        System.out.println("*******************************************************");
        System.out.println("Press 1 to Deposit Amount.");
        System.out.println("Press 2 to Withdraw Amount.");
        System.out.println("Press 3 to View Balance");
        System.out.println("Press any key to cancel the process");
        System.out.println("*******************************************************");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press any key: ");
        selectedOption = scanner.nextInt();
        switch (selectedOption) 
        {
            case 1:
                 Deposit d = new Deposit();
                 int depamt =  d.userInput();
                 b.add(depamt);
                 showMenu();
                break;
            case 2:
                 System.out.print("Please Enter the amount to withdraw: ");
                 int withamt=scanner.nextInt();
                 b.withdraw(withamt);
                 showMenu();
                break;
            case 3:
                  System.out.println("Your Account Balance is "+b.getBalance()+" Rupees");
                  System.out.println(" ");  
                  showMenu();
                break;
        
            default:
                  System.out.println("Transaction Ended, Your Account has been Logout Successfully......Don't forget to remove your card!!!");
                  System.exit(0);
                break;
        }
        
    }
}
