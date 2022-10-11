
import java.util.*;

class dongVat {
	private String thucan;
	private double cannang;
	private String gioitinh;
	
	dongVat() {}
	dongVat(String t, double w, String s) {
		this.thucan = t;
		this.cannang = w;
		this.gioitinh = s;
	}
	
	public String getThucan() {
		return thucan;
	}
	public void setThucan(String thucan) {
		this.thucan = thucan;
	}
	public double getCannang() {
		return cannang;
	}
	public void setCannang(double cannang) {
		this.cannang = cannang;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Can Nang: ");
		cannang = sc.nextDouble();
	}
	public String toString() {
		return thucan + "\t" + cannang + "\t" + gioitinh;
	}
}
class Cat extends dongVat {
	private String tenMeo;
	private int tuoiMeo;
	private String loaiMeo;
	
	Cat() {}
	Cat(String tenM, int tuoiM, String loaiM) {
		super();
		this.tenMeo = tenM;
		this.tuoiMeo = tuoiM;
		this.loaiMeo = loaiM;
	}
	
	public String getTenMeo() {
		return tenMeo;
	}
	public void setTenMeo(String tenMeo) {
		this.tenMeo = tenMeo;
	}
	public int getTuoiMeo() {
		return tuoiMeo;
	}
	public void setTuoiMeo(int tuoiMeo) {
		this.tuoiMeo = tuoiMeo;
	}
	public String getLoaiMeo() {
		return loaiMeo;
	}
	public void setLoaiMeo(String loaiMeo) {
		this.loaiMeo = loaiMeo;
	}
	void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten Meo: "); tenMeo = sc.nextLine();
		System.out.println("Nhap tuoi Meo: "); tuoiMeo = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap loai Meo: "); loaiMeo = sc.nextLine();
	}
	void in() {
		System.out.println("Day la Meo, ten la " + tenMeo);
	}
	public String toString() {
		return "Day la con Meo, ten la " + tenMeo + ", Nang " + getCannang() + "kg";
	}
}
class Dog extends dongVat {
	private String tenCho;
	private String loaiCho;
	private int tuoiCho;
	
	Dog() {}
	Dog(String tenC, String loaiC, int tuoiC) {
		super();
		this.tenCho = tenC;
		this.loaiCho = loaiC;
		this.tuoiCho = tuoiC;
	}
	
	public String getTenCho() {
		return tenCho;
	}
	public void setTenCho(String tenCho) {
		this.tenCho = tenCho;
	}
	public String getLoaiCho() {
		return loaiCho;
	}
	public void setLoaiCho(String loaiCho) {
		this.loaiCho = loaiCho;
	}
	public int getTuoiCho() {
		return tuoiCho;
	}
	public void setTuoiCho(int tuoiCho) {
		this.tuoiCho = tuoiCho;
	}
	void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten Cho: "); tenCho = sc.nextLine();
		System.out.println("Nhap loai Cho: "); loaiCho = sc.nextLine();
		System.out.println("Nhap tuoi Cho: "); tuoiCho = sc.nextInt();
	}
	void in() {
		System.out.println("Day la Cho, ten la " + tenCho);
	}
	public String toString() {
		return "Day la con Cho, ten la " + tenCho + ", Nang " + getCannang() + "kg";
	}
}

public class Animal {
	ArrayList<dongVat> L = new ArrayList<dongVat>();
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong dong vat: "); int n = sc.nextInt();

		for(int i=0; i<n; i++) {
			System.out.println("Meo hay Cho ? (0/1)");
			int chon = sc.nextInt();
			if(chon == 0) {
				Cat c = new Cat();
				c.nhap();
				L.add(c);
			} else if(chon == 1){
				Dog d = new Dog();
				d.nhap();
				L.add(d);
			} else {
				System.out.println("Lua chon sai, vui long thu lai?");
			}
		}
	}
	
	void in() {
		for(int i=0; i<L.size(); i++) {
			System.out.println(L.get(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal a = new Animal();
		a.nhap();
		a.in();
	}

}
