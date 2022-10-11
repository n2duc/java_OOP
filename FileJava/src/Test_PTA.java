import java.util.Scanner;

class NV {
	String name;
	double hsl;
	
	NV() { }
	NV(String n, double h) {
		this.name = n;
		this.hsl = h;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHsl() {
		return hsl;
	}
	public void setHsl(double hsl) {
		this.hsl = hsl;
	}
	
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten NV: "); name = sc.nextLine();
		System.out.println("Nhap HSL: "); hsl = sc.nextDouble();
	}
	void tinhLuong() {
		double luong = hsl*1500;
		System.out.println("Luong: " + luong);
	}
	void in() {
		System.out.println("\n Ten: " + name + " HSL: " + hsl);
		tinhLuong();
	}
}
class QL extends NV {
	String cv;
	double phucap;
	
	QL() { }
	QL(String n, double h, String cv1, double pc) {
		super(n, h);
		this.cv = cv1;
		this.phucap = pc;
	}
	
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	public double getPhucap() {
		return phucap;
	}
	public void setPhucap(double phucap) {
		this.phucap = phucap;
	}
	void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap Chuc vu: "); cv = sc.nextLine();
		System.out.println("Nhap Phu Cap: "); phucap = sc.nextDouble();
	}
	void tinhLuong() {
		double luong = hsl*1500 + phucap;
		System.out.println("Luong QL: " + luong);
	}
	void in() {
		super.in();
		System.out.println("\n ChucVu: " + cv + " PhuCap = " + phucap);
	}
}
public class Test_PTA {
	
	public static void main(String[] args) {
//		System.out.println("\nBan muon in lai nhan vien hay quan li (0/1)?");
//		int tl = sc.nextInt();
//		if(tl ==0) p=n1; else p=q;
		//Tinh da hinh
//		p.in();
//		p.tinhLuong();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap ten cong ty: "); String tenCT = sc.nextLine();
		System.out.println("\nNhap so luong nhan vien: "); int n = sc.nextInt();
		
		NV n1 = new NV();
		QL q = new QL();
		NV[] p = new NV[n];
		
		int chon;
		int i = 0;;
		do {
			System.out.println("\nChon Nhan vien hay Quan li (0/1)?");
			chon = sc.nextInt();
			
			if(chon == 0) {
				p[i] = n1;
				p[i].nhap();
			} else if(chon == 1) {
				p[i] = q;
				p[i].nhap();
			}
			i++;
		} while(i != n);
		
		for(int j=0; j<n; j++) {
			p[j].in();
		}
		
	}

}
