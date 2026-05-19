import java.util.Scanner;

public class Swup{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a = ");
        int a = sc.nextInt();
        System.out.println("Enter the numbrr b = ");
        int b = sc.nextInt();
        
        System.out.println("Before swapping: a= "+a+" b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a= "+a+" b= "+b);
    }
    
}