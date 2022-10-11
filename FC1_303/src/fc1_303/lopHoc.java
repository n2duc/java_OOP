package fc1_303;

import java.util.Scanner;

class sinhVien {
	
	String name;
	double diemTB;
	String address;
		
	public sinhVien(String name, double diemTB, String address) {
		this.name = name;
		this.diemTB = diemTB;
		this.address = address;
	}
	public sinhVien() {
		this.name = "";
		this.diemTB = 0;
		this.address = "";
	}
	
	public void getInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ten: ");
		this.name = sc.nextLine();
		System.out.println("Diem TB: ");
		this.diemTB = sc.nextDouble();
		System.out.println("Dia chi: ");
		this.address = sc.nextLine();
	}
	
	public String toString() {
		return "hoTen:" + this.name + ", diemTB:" + this.diemTB + ", diaChi:" + this.address; 
	}
}


public class lopHoc {
	sinhVien []sv;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong SV: ");
		int n = sc.nextInt();
		sv = new sinhVien[n];
		for(int i=0; i<n; i++) {
			sv[i].getInfo();
		}
	}
	
	

	public static void main(String[] args) {
		lopHoc l = new lopHoc();
		l.input();
	}

}
