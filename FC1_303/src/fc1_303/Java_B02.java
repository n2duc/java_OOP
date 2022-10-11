package fc1_303;

import java.util.Scanner;
import java.util.Random;


public class Java_B02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen n: ");
		int n = sc.nextInt();
		Random rnd = new Random();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			int x = Math.abs(rnd.nextInt(1000) + 1);
			System.out.print(x + " ");
			sum += x;
		}
		System.out.print("\nTong cac so = " + sum);
		
		sc.close();

	}

}
