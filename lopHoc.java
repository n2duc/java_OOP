package n2duc.io;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class sinhVien {
    public
        String hoTen;
        String queQuan;
        float diemTB;
    sinhVien() {
        this.hoTen = "";
        this.queQuan = "";
        this.diemTB = 0;
    }
    sinhVien(String hoTen, String queQuan, float diemTB) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.diemTB = diemTB;
    }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public String getQueQuan() { return queQuan; }
    public void setQueQuan(String queQuan) { this.queQuan = queQuan; }
    public float getDiemTB() { return diemTB; }
    public void setDiemTB(float diemTB) { this.diemTB = diemTB; }

    @Override
    public String toString() {
        return hoTen + " - " + queQuan + " - " + diemTB;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho va Ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap Quen quan: ");
        queQuan = sc.nextLine();
        System.out.println("Nhap Diem TB: ");
        diemTB = sc.nextFloat();
    }

    public void output() {

    }
}

public class lopHoc {
    String tenLop;
    ArrayList<sinhVien> L = new ArrayList<sinhVien>();

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten lop hoc: "); tenLop = sc.nextLine();
        System.out.println("> Nhap so luong SinhVien: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println(">> Sinh vien thu " + (i+1) + ": ");
            sinhVien s = new sinhVien();
            s.input();
            L.add(s);
        }
    }
    void in() {
        System.out.println("\n\t>> Danh sach SinhVien cua lop " + tenLop + " <<");
        for(int i = 0; i < L.size(); i++) {
            System.out.println((i+1) + ". " + L.get(i));
        }
    }
    void sortName() {
        System.out.print("\n>> Danh sach SinhVien lop " + tenLop + " sau khi sap xep <<");
        L.sort(Comparator.comparing(sinhVien::getHoTen));
    }
    void timQuequan() {
        Scanner sc = new Scanner(System.in);
        String que;
        int count = 0;
        System.out.println("\n\n> Nhap Que quan can tim: "); que = sc.nextLine();

        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).getQueQuan().toUpperCase().compareTo(que.toUpperCase()) == 0) {
                count++;
            }
        }
        System.out.println(">> SinhVien co Que quan o " + que.toUpperCase() + ": " + count);
    }
    void congDiem() {
        String diachi = "Quang Tri";
        for(int i = 0; i < L.size(); i++) {
            if(L.get(i).getQueQuan().toUpperCase().compareTo(diachi.toUpperCase()) == 0) {
                if(L.get(i).getDiemTB() >= 9.7 ) {
                    L.get(i).setDiemTB(10);
                } else {
                    L.get(i).setDiemTB(L.get(i).getDiemTB() + 0.3f);
                }
            }
        }
        System.out.print("\n>> Danh sach SinhVien lop " + tenLop + " sau khi cong diem <<");
    }
    public static void main(String[] args) {
        lopHoc lh = new lopHoc();
        lh.nhap();
        lh.in();
        lh.sortName(); lh.in();
        lh.timQuequan();
        lh.congDiem(); lh.in();
    }
}
