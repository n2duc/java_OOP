package fc1_303;

import java.util.Scanner;
import java.util.Random;

public class Java_B01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int sum = 0;
		while( n != 0 ) {
			System.out.print("Enter a number (0 to quit): ");
			n = sc.nextInt();
			sum = sum + n;
		}
		System.out.print("The total is "+sum);
		
		
		String phrase;
		do {
			System.out.print("\nType your password: ");
			phrase = sc.next();
			
		} while( !phrase.equals("duytan") );
		
		
		Random rand = new Random();
		int x = rand.nextInt(5) + 1;
		System.out.print(x);
		
		
		
		sc.close();
		
	}

}
