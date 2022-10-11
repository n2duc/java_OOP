package fc1_303;

import java.util.Scanner;

public class Java_BT2 {

	public static void main(String[] args) {
		int n, temp, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen n: ");
		n = sc.nextInt();
		
		do {
			temp = n % 10;
			n = n / 10;
			sum = sum + temp;
		} while (n != 0);
		
		System.out.print(sum);
		sc.close();
	}

}
