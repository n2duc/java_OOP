package fc1_303;

import java.util.Scanner;
import java.lang.Math;

public class Java_BT1 {
	
	static int GT(int n) {
		int sum = 1, total = 0;
		for(int i=1; i<=n; i++) {
			sum = sum * i;
			total = total + sum;
		}
		return total;
	}
	
	static int BP(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + (i*i);
		}
		return sum;
	}
	
	static double PS(int n) {
		double sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + (double)(i-1)/i;
		}
		return sum;
	}
	
	static int DS(int n) {
		int sum = 1;
		for(int i=1; i<=n; i++) {
			sum = (int)(sum + Math.pow(2, 2*i - 1));
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen n (n>0): ");
			n = sc.nextInt();
		} while (n <= 0);
		int P = BP(n), S1 = GT(n), S3 = DS(n);
		System.out.println("P = " + P);
		System.out.println("S1 = " + S1);
		System.out.printf("s2 = %.4f\n", PS(n));
		System.out.print("S3 = " + S3);
		
		sc.close();
	}

}
