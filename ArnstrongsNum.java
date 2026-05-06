import java.util.Scanner;

public class ArnstrongsNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the input number : ");
        int number = obj.nextInt();
        int temp = 0, sum = 0, digits = 0;
        temp = number;
        while(number != 0){
            number /= 10;
            digits++;
        }
        number = temp;
        while(number != 0){
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;

        }
        if(sum == temp){
            System.out.println(sum + " is Armstrongs Number");
        }
        else{
            System.out.println(temp + "  is not Armstrongs Number");
        }

    }
    
}
