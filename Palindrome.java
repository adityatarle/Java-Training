package training;
//package training;
import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args) {
		System.out.println(" enter a number first");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		int rem;
		int rev=0;
		do {
			rem = a%10;
			rev= (rev*10)+rem;
			a=a/10;
			}while(a>0);
		if (rev == b) {
			System.out.println(" no is palindrome ");
		}
		else {
			System.out.println("no is chutiyA");
		}
		
	}	
}
