package n2duc.lab1;

import java.util.Scanner;

public class Bill {
	private String customerCode;
	private String customerType;
	private float oldIndex;
	private float newIndex;
	
	public Bill() {}
	public Bill(String customerCode, String customerType, float oldIndex, float newIndex) {
		this.customerCode = customerCode;
		this.customerType = customerType;
		this.oldIndex = oldIndex;
		this.newIndex = newIndex;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public float getOldIndex() {
		return oldIndex;
	}
	public void setOldIndex(float oldIndex) {
		this.oldIndex = oldIndex;
	}
	public float getNewIndex() {
		return newIndex;
	}
	public void setNewIndex(float newIndex) {
		this.newIndex = newIndex;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Code: ");
		this.customerCode = sc.nextLine();
		System.out.println("Enter Customer Type: ");
		this.customerType = sc.nextLine();
		System.out.println("Enter OldIndex Water: ");
		this.oldIndex = Float.parseFloat(sc.nextLine());	
		System.out.println("Enter NewIndex Water: ");
		this.newIndex = Float.parseFloat(sc.nextLine());
	}
	
	public int price() {
		if(this.customerType.equals("Resident")) {
			return 500;
		} else if(this.customerType.equals("Business") || this.customerType.equals("Organization")) {
			return 400;
		} else {
			return 300;
		}
	}
	
	public float payment() {
		return this.price() * (this.newIndex - this.oldIndex);
	}
	@Override
	public String toString() {
		return "Bill ["
				+ "customerCode=" + customerCode 
				+ ", customerType=" + customerType 
				+ ", oldIndex=" + oldIndex
				+ ", newIndex=" + newIndex 
				+ "]";
	}

}

