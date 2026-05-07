import java.util.Scanner;

class Account{
    private double balance=110.0;
    private int rateofInterest=10;

    public double get_balance(){
        return balance;
    }
    public void addInterest(){

    }
    public void get_details(){
        System.out.println("Your current balance : " + balance + " BDT");
        System.out.println("Interest Rate : " + rateofInterest + "%");
    }

    public double setBalance(double balance){
        this.balance = balance;
        return balance;
    }
    public int getRate(){
        return rateofInterest;
    }
}
class Savings extends Account{
    private int rateofInterest;

    public void withdraw(double amount){
        double total1 = setBalance(get_balance() + amount);
        System.out.println("Withdraw Successful " + total1 + " BDT");
    }
    public void deposit(double amount){
        double total = setBalance(get_balance() + amount);
        System.out.println("Deposit Successful " + total + " BDT");
    }
     public void addInterest(){
        double interest = (get_balance() * getRate()) / 100; //apply formula
        double total2 = setBalance(get_balance() + interest);
        System.out.println("Your current balance : " + get_balance() + " BDT");
        System.out.println("Your current balance with interest : " + total2 + " BDT");
     }
     public void get_details(){
        System.out.println("Savings Account Balance : " + get_balance());
     }
}
class Credit extends Account{
    private int rateofInterest;
    private double amount;

     public void withdraw(double amount){

    }
    public void deposit(double amount){

    }
     public void addInterest(){

     }
     public void get_details(){

     }
}
public class Uml {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        System.out.println("1.Saving Account");
        System.out.println("2.Credit Account");
        int choice =s.nextInt();

        Account a = new Account();
        
        Savings s1 = new Savings();

        Credit c1 = new Credit();

        if(choice == 1){
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Add Interest");
            System.out.println("4.Get Details");
            int choice1 = s.nextInt();

            if(choice1 == 1){
                System.out.println("Enter your amount to withdraw :");
                double amount = s.nextDouble();
                s1.withdraw(amount);
            }
            else if(choice1 == 2){
                System.out.println("Enter your amount to deposit :");
                double amount2 = s.nextDouble();
                s1.deposit(amount2);
            }
            else if(choice1 == 3){
                s1.addInterest();
            }
            else if(choice1 == 4){
                a.get_details();
            }
            else{
                System.out.println("Please Enter choice between (1-4) ");
            }
        }
        else{
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Get Details");
            int choice1 = s.nextInt();
        }
    }
    
}
