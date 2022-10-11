package n2duc.lab1;

import java.util.Scanner;

public class BillList {
	private Bill[] bill;
	private int n;
	
	public BillList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter invoice number: ");
		this.n = sc.nextInt();
		bill = new Bill[n];
		
		for(int i = 0; i < n; i++) {
			bill[i] = new Bill();
			bill[i].input();
		}
	}
	void output() {
		System.out.println("\n==== LIST BILL ====");
		for(int i=0; i < n; i++) {
			System.out.println(bill[i]);
		}
	}
	public void total() {
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += bill[i].payment();
		}
		System.out.println("\nTotal Payment: " + sum);
	}
	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CustomerCode to Remove: ");
		String codeRemove = sc.nextLine();
		int co = 0, k = 0;
		
		for(Bill x:bill) {
			if(x.getCustomerCode().compareTo(codeRemove) == 0) {
				co = 1;
				break;
			}
		}
		if(co == 1) {
			Bill[] temp = new Bill[n-1];
			for(int i=0; i<n; i++) {
				if(bill[i].getCustomerCode().compareTo(codeRemove) != 0)
					temp[k++] = bill[i];
			}
			n = n - 1;
			bill = temp;
			System.out.println("Done deleting!");
		} else {
			System.out.println("No customers found!");
		}
		output();
	}
	
	public void maxPayment() {
		Bill maxBill = bill[0];
		for(int i=0; i < n; i++) {
			if(maxBill.payment() < bill[i].payment()) {
				maxBill = bill[i];
			}
		}
		System.out.println("\nLargest payment: " + maxBill);
	}

	public static void main(String[] args) {
		BillList BL = new BillList();
		BL.output();
		BL.total();
		BL.maxPayment();
		BL.remove();
	}

}
