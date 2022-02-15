package atmproject;
class Account
{
    int amount = 5000;
    public void initiate() throws Exception
    {
        Login l1 = new Login();
            l1.acceptInput();
            l1.verify();
    }
    public int getBalance()
    {
        return amount;
    }
    public void add(int amt)
    {
        amount = amount + amt;
        System.out.println("*******************************************************");
        System.out.println("Amount deposited Successfully");
        System.out.println(" ");
        System.out.println("Total Balance: " +amount);
        System.out.println(" ");
    }
    public void withdraw(int amt)
    {
        System.out.println(" ");
        if(amount < amt)
        {
            Invalid_transaction invalidWithDraw = new Invalid_transaction("InValid Withdrawal Amount");
            System.out.println(invalidWithDraw.getMessage());
        }else{
            amount = (amount - amt);
            System.out.println("Please Collect your " + amt +" Rupees");
            System.out.println(" ");
            System.out.println("Available Balance: " +amount);
            System.out.println(" ");
        }
    }
}
