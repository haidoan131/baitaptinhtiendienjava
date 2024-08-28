package Thu4OnTapOOP.BaiTapDienLuc;

import java.util.Scanner;

public class HoKinhDoanh extends HoaDon{
    private int loai;
    public HoKinhDoanh(){}
    public void nhap(){
        super.nhap();
        System.out.println("Nhập loại kinh doanh :");
        System.out.println("1:nhà hàng , 2: khách sạn, 3:cty tư nhân ,4:cty nhà nước ");
        Scanner sc=new Scanner(System.in);
         loai=sc.nextInt();
    }
    public void xuat(){
        super.xuat();
        if(loai==1)
            System.out.println("nhà hàng");
        else if(loai==2)
            System.out.println("khách sạn");
        else if(loai==3)
            System.out.println("cty tư nhân");
        else if(loai==4)
            System.out.println("cty nhà nước");

        System.out.println("so tien can thanh toan:"+tinhtien());
    }
    public float tinhtien(){
        float sokwtieuthu=getChiSoMoi()-getChiSoCu();
        float tiendien=sokwtieuthu*3000;
        float thuegtgt=0.1f*tiendien;
        float tienuudai=0;
        if(loai==4)
            tienuudai=tiendien*0.05f;

        return tiendien+thuegtgt-tienuudai;
    }
}
