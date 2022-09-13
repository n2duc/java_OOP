package fc1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;


class sinhvien {
	public
		String hoTen;
		String diaChi;
		float diemTB;
	
	public String gethoTen() {
		return hoTen;
	}
	public void sethoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getdiaChi() {
		return diaChi;
	}
	public void setdiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public float getdiemTB() {
		return diemTB;
	}
	public void setdiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	
	
	sinhvien() {
		this.hoTen = "";
		this.diaChi = "";
		this.diemTB = 0;
	}
	
	sinhvien(String hoTen, String diaChi, float diemTB) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.diemTB = diemTB;
	}
	
	@Override
	public String toString() {
		return "Ten: " + hoTen + " - DiaChi: " + diaChi + " - DiemTB: " + diemTB;
	}
	
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap HoTen: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap Dia Chi: ");
		diaChi = sc.nextLine();
		System.out.print("Nhap DiemTB: ");
		diemTB = sc.nextFloat();
	}
	
	void in() {
		System.out.println("Ten: " + hoTen + " - DiaChi: " + diaChi + " - DiemTB: " + diemTB);
	}
}

public class lophoc {
	String tenLop;
	ArrayList<sinhvien> l = new ArrayList<sinhvien>();
	
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten lop: "); 
		tenLop = sc.nextLine();
		System.out.print("Nhap so sinh vien: "); 
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1; i<= n; i++) {
			System.out.println("Nhap sv thu " + i + ": ");
			sinhvien s = new sinhvien();
			s.nhap();
			l.add(s);
		}
	}
	
	void in() {
		System.out.println("\n Danh sach lop " + tenLop);
		for(int i=0; i<l.size();i++) {
			System.out.print("\n\t" + l.get(i));
		}
	}
	
	void sortName() {
		System.out.print("\n\nDanh sach lop " + tenLop + " sap xep theo hoTen:");
		l.sort(Comparator.comparing(sinhvien::gethoTen));
	}
	
	void timDiaChi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nNhap dia chi de kiem tra: ");
		String diachi = sc.nextLine();
		int dem = 0;
		for(int i=0; i<l.size(); i++) {
			if(l.get(i).getdiaChi().toUpperCase().compareTo(diachi.toUpperCase()) == 0) {
				dem++;
			}
		}
		System.out.println("So nguoi co dia chi o " + diachi + ": " + dem);
	}
	
	void congDiem() {
		
	}
	public static void main(String[] args) {
		lophoc lh = new lophoc();
		lh.nhap();
		lh.in();
		lh.sortName();
		lh.in();
		lh.timDiaChi();
		lh.congDiem();
	}
}
