package Thu4OnTapOOP.BaiTapDienLuc;

public class HoBinhThuong extends HoaDon{
    public HoBinhThuong(){}

    public void xuat(){
        super.xuat();
        System.out.println("tien dien can dong:"+tinhtien());
    }
    public float tinhtien(){
        float tiendien=0;
        float sokwtieuthu=getChiSoMoi()-getChiSoCu();
        if(sokwtieuthu<=50 && sokwtieuthu >=0){
            tiendien=sokwtieuthu*1500;
        }
        else if(sokwtieuthu>=51 && sokwtieuthu <=100)
            tiendien=(50*1500)+(sokwtieuthu-50)*2000 ;
        else if(sokwtieuthu>100){
            tiendien=(50*1500)+(50*2000)+(sokwtieuthu-100)*2800;
        }
        return tiendien+(tiendien*0.1f);
    }
}
