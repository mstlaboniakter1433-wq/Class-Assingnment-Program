import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		int i,n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		for(i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2){
            System.out.println(n+ " is prime number");
		}
		else{
			System.out.println(n+ " Not prime number");
		}

	}

}