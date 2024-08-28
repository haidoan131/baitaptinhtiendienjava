package Thu4OnTapOOP.BaiTapDienLuc;

import java.util.Scanner;

public abstract class HoaDon {
    private String maKh;
    private String tenKh;
    private float chiSoCu;
    private float chiSoMoi;
    private float tienDien;

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public float getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(float chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public float getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(float chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public float getTienDien() {
        return tienDien;
    }

    public void setTienDien(float tienDien) {
        this.tienDien = tienDien;
    }

    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập mã : ");
        setMaKh(sc.nextLine());
        System.out.println("nhập tên:");
        setTenKh(sc.nextLine());
        System.out.println("nhập chỉ số cũ:");
        setChiSoCu(sc.nextFloat());
        System.out.println("nhập chỉ số mới:");
        setChiSoMoi(sc.nextFloat());
    }
    public void xuat(){
        System.out.println("++++++++++++++++");
        System.out.println("mã Kh:"+getMaKh()+" tên kh :"+getTenKh()+" chỉ số cũ:"+getChiSoCu()+" chỉ số mới:"+getChiSoMoi());
    }
    public abstract float tinhtien();



}
