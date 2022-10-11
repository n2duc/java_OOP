package fc1_303;

import java.util.Scanner;
import java.lang.Math;

public class DTNTTG {
 	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2;
		int[][] riangle = new int[3][2];
		
		for(int i=0; i< riangle.length; i++) {
			System.out.print("Toa do diem thu " + (i+1) + ": ");
			for(int j=0; j < riangle[i].length; j++) {
				riangle[i][j] = sc.nextInt();
			}
		}
		
		x1 = riangle[0][0] - riangle[1][0];
		y1 = riangle[0][1] - riangle[1][1];
		x2 = riangle[0][0] - riangle[2][0];
		y2 = riangle[0][1] - riangle[2][1];
		
		
		int edge1 = x1*x2;
		int edge2 = y1*y2;
		if(edge1 + edge2 == 0) {
			System.out.println("Tam giac vuong");
		} else {
			System.out.println("Khong phai");
		}
		
		
		
		
		
	}

	
}
