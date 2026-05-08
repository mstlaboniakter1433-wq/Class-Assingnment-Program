import java.util.Scanner;

class Account{
    private double balance=0.0;
    private int rateofInterest=10;

    public double get_balance(){
        return balance;
    }
    public void addInterest(){
       double interest = (balance * rateofInterest) / 100;
        balance = balance + interest;
        System.out.println("Interest Added : " + interest + " BDT");
    }
    public void get_details(){
        System.out.println("Your current balance : " + balance + " BDT");
        System.out.println("Interest Rate : " + rateofInterest + "%");
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public int getRate(){
        return rateofInterest;
    }
}

class Savings extends Account{
    private int rateofInterest;

    public void withdraw(double amount){
        if(amount > get_balance()){
            System.out.println("Insufficient Balance");
        }
        else{
            setBalance(get_balance() - amount);
            System.out.println("Withdraw Successful " + amount + " BDT");
        }
    }
    public void deposit(double amount){
        setBalance(get_balance() + amount);
        System.out.println("Deposit Successful " + amount + " BDT");
    }
     public void addInterest(){
        double interest = (get_balance() * getRate()) / 100; //apply formula
        setBalance(get_balance() + interest);
        System.out.println("Your current balance : " + get_balance() + " BDT");
        System.out.println("Your current balance with interest : " + interest + " BDT");
     }
     public void get_details(){
        System.out.println("Savings Account Balance : " + get_balance());
     }
}

class Credit extends Account{

    private int rateofInterest;
    private double amount;

     public void withdraw(double amount){
        this.amount = this.amount + amount;
        System.out.println("Credit Withdraw Successful " + amount + " BDT");

    }
    public void deposit(double amount){
        this.amount = this.amount - amount;
        System.out.println("Credit Deposit Successful" + amount + " BDT");
    }
     public void addInterest(){
        double interest = (amount * getRate()) / 100;
        amount = amount + interest;
         System.out.println("Interest Added : " + interest + " BDT");

     }
     public void get_details(){
         System.out.println("Credit Amount : " + amount + " BDT") ;
     }
}

public class BankingSystem {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Savings s1 = new Savings();
        Credit c1 = new Credit();


        System.out.println("Welcome Here");

        while(true){
            
            System.out.println();
            System.out.println("Enter your choice : ");
            System.out.println("1.Saving Account");
            System.out.println("2.Credit Account");
            System.out.println("3.Exit");
            int choice =s.nextInt();
            
            //Savings Parts
             
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
                    s1.get_details();
                }
                else{
                    System.out.println("Please Enter choice between (1-4) ");
                }
            }
            
            //Credit Parts
    
            else if(choice == 2){
                System.out.println("1.Withdraw");
                System.out.println("2.Deposit");
                System.out.println("3.Add Interset");
                System.out.println("4.Get Details");
                int choice2 = s.nextInt();
    
                if(choice2 == 1){
                    System.out.println("Enter your amount to withdraw : ");
                    double amount = s.nextDouble();
                    c1.withdraw(amount);
                }
                else if(choice2 == 2){
                    System.out.println("Enter your amount to deposit : ");
                    double amount = s.nextDouble();
                    c1.deposit(amount);
                }
                else if(choice2 == 3){
                    c1.addInterest();
                }
                else if(choice2 == 4){
                    c1.get_details();
                }
                else{
                    System.out.println("Please Enter choice between (1-4) ");
                }

            }
            else if(choice == 3){
                System.out.println("Exit Successful");
                break;
            }
            else{
                System.out.println("Please Enter choice between (1-3) ");
            }
        }
    }
    
}
