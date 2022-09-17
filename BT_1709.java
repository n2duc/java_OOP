package fc1_303;

import java.util.Scanner;

public class BT_1709 {
	static class employee{
		String ten;
		double luong;
		
		employee() {}
		
		employee(String ten, double luong){
			this.ten = ten;
			this.luong = luong;
		}
		public String getTen() {
			return ten;
		}
		public void setTen(String ten) {
			this.ten = ten;
		}
		public double getLuong() {
			return luong;
		}
		public void setLuong(double luong) {
			this.luong = luong;
		}
		
		public String toString() {
			return ten + ", " + luong;
		}
		void nhap() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhap ten:"); 
			ten=sc.nextLine();
			System.out.println("Nhap luong:"); 
			luong=sc.nextDouble();
		}
		void xuat() {
			System.out.println(ten + ", " + luong);
		}
		void calSalary() {
			setLuong(luong*1500);
			System.out.println("Luong theo nhan vien: " + luong);
		}
	}
	static class manager extends employee{
		String phongban;
		double phucap;
		
		manager() {}
		
		manager(String ten, double luong, String phongban, double phucap){
			super(ten ,luong);
			this.phongban = phongban;
			this.phucap = phucap;
		}
		public String getPhongban() {
			return phongban;
		}
		public void setPhongban(String phongban) {
			this.phongban = phongban;
		}
		public double getPhucap() {
			return phucap;
		}
		public void setPhucap(double phucap) {
			this.phucap = phucap;
		}
		public String toString() {
			return phongban+","+phucap;
		}
		void nhap() {
			Scanner sc = new Scanner(System.in);
			super.nhap();
			System.out.println("Nhap phong ban:"); 
			phongban=sc.nextLine();
			System.out.println("Nhap phu cap:"); 
			phucap=sc.nextDouble();
		}
		void xuat() {
			System.out.println("\nThong tin Quan Ly: ");
			super.xuat();
			System.out.println(phongban + ", " + phucap);
		}
		void calSalary() {
			super.calSalary();
			super.setLuong(luong + phucap);
			System.out.println("Luong Quan Li: " + luong);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int chon;
		int x;
		do {
			System.out.println("Nhan vien hay Quan li (1/0) ?");
			chon = sc.nextInt();
			
			if(chon == 1) {
				employee e = new employee();
				e.nhap();
			} else if (chon == 0){
				manager m = new manager();
				m.nhap();
			}
			
			System.out.println("Tiep tuc khong? (0/1)");
			x = sc.nextInt();
			if(x == 0) break;
		
		} while(true);
		
		
//		employee e = new employee();
//		manager m = new manager();
//		e.nhap();
//		e.xuat();
//		e.calSalary();
//		
//		m.nhap();
//		m.xuat();
//		m.calSalary();
		
		
	}

}
