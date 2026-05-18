import java.util.Scanner;

public class Palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
         String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println("Palindrome");
        } 
        else{
            System.out.println("Not a Palindrome");
        }
    }
}