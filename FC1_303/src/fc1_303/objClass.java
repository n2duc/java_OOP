package fc1_303;

public class objClass {

	public static void main(String[] args) {
		
		int[] a = new int[100];
		
	    for (int i = 0; i < 100; i++) {
	      int value = (int)(Math.random() * 10);
	      a[value]++;
	    }

	    for (int i = 0; i < a.length; i++) {
	      System.out.println("Count for " + i + " is " + a[i]);
	    }
	    
	}

}
