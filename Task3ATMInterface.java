import java.util.Scanner;

class BankAccount
{
    private double Bankbalance;
    public BankAccount(double initialBalance)
    {
        this.Bankbalance=initialBalance;
    }

    public double getBalance()
    {
        return Bankbalance;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            Bankbalance+=amount;
            System.out.println("Deposit of Rs " +amount+ "successful");
            System.out.println("Current Balance: " +Bankbalance);
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=Bankbalance)
        {
            Bankbalance -=amount;
            System.out.println("Withdrawal of Rs " +amount+ " Successful "); 
            System.out.println("Current Balance: " +Bankbalance);
        }
        else
        {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
}
class ATM
{
    private BankAccount bankAccount;
    public ATM(BankAccount bankAccount)
    {
        this.bankAccount=bankAccount;
    }
    public void displayMenu()
    {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Your Account Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

    }
    public void performTransaction(int ch, Scanner sc)
    {
        switch(ch)
        {
            case 1:
                System.out.println("Current balance: Rs " + bankAccount.getBalance());
                break;
            case 2:
                System.out.println("Enter deposit Amount: Rs");
                double depositAmount=sc.nextDouble();
                bankAccount.deposit(depositAmount);
                break;
            case 3:
                System.out.println("Enter withdrawal Amount: Rs");
                double withdrawalAmount=sc.nextDouble();
                bankAccount.withdraw(withdrawalAmount);
                break;
            case 4:
                System.out.println("You have exited from ATM. Thank you for using ATM!");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please select a valid option.");

        }
    }
}
class AtmInterface
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter initial Account Balance: Rs");
        double initialBalance=sc.nextDouble();
        BankAccount bankAccount=new BankAccount(initialBalance);

        ATM atm=new ATM(bankAccount);
        while(true)
        {
            atm.displayMenu();
            System.out.println("Select an option: ");
            int ch=sc.nextInt();

            atm.performTransaction(ch, sc);
        }
    }
}