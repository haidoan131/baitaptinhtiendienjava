package Thu4OnTapOOP.BaiTapNhomMau;

import java.util.Scanner;

public class NhomMau {
    private int rh;
    private int loai;
    public static final int _O=1;
    public static final int _A=2;
    public static final int _B=3;
    public static final int _AB=4;
    public NhomMau(){}

    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.rh+ 2:rh-");
        loai=sc.nextInt();
    }
    public void xuat(){
        System.out.println("######");
        if(this.loai==_A)
            System.out.println("A");
        else if(this.loai==_O)
                System.out.println("0");
        else if(this.loai==_B)
            System.out.println("B");
        else if(this.loai==_AB)
            System.out.println("AB");

        if(rh==1)
            System.out.print("+");
        else if(rh==2)
            System.out.println("-");

    }

    public int getRh() {
        return rh;
    }

    public void setRh(int rh) {
        this.rh = rh;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }
}
