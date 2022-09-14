package fc1_b01;

import java.util.Scanner;

class Nguoi {
	String ten;
	String que;
	int tuoi;
	
	Nguoi(){}
	Nguoi(String name, String add, int age) { ten = name; que = add; tuoi = age; }
	
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: "); ten = sc.nextLine();
		System.out.println("Nhap que: "); que = sc.nextLine();
		System.out.println("Nhap tuoi: "); tuoi = sc.nextInt();
	}
	
	void in() {
		System.out.println("\nTen: " + ten + ", Que:  " + que + ", Tuoi: " + tuoi);
	}
	
	String getTen() { return ten; }
	String getQue() { return que; }
	float getTuoi() { return tuoi; }
}

public class Nhanvien extends Nguoi {
	float hsl;
	
	void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("\nNhap he so luong: "); hsl = sc.nextFloat();
	}
	
	Nhanvien() {}
	Nhanvien(String name, String add, int age, float salary) {
		super(name, add, age);
		hsl = salary; 
	}
	
	void in() {
		super.in();
		System.out.println("He so luong: " + hsl);
	}
	
	public static void main(String[] args) {
		Nhanvien nv = new Nhanvien();
		nv.nhap();
		nv.in();

	}

}
