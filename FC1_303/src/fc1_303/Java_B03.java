package fc1_303;

public class Java_B03 {
	
	static int checkPrime(int x) {
		if(x < 2) {
			return 0;
		} else {
			int d = 0;
			for(int i=2; i < x; i++) {
				if(x%i == 0) {
					d++;
					break;
				}
			}
			if(d==0) return 1;
			else return 0;
		}
	}
	
	
	static boolean checkSoNT(int n) {
		if(n < 2) {
			return true;
		} else {
			for(int i = 2; i <= Math.sqrt(n); i++) {
				if( n % i == 0) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		//n=1000000 time duoi 1s
		
		int n=1000000;
		System.out.println("\nCac so nguyen to nho hon " + n + ":");
		for(int i =1; i<n; i++) {
			if(checkSoNT(i)) System.out.print(i + " ");
		}
		System.out.print("\nDone!!");
	}

}
