package Thu4OnTapOOP.BaiTapDienLuc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachHoaDon {
    private List<HoaDon> arr=new ArrayList<>();
    public void nhap(){
        System.out.println("===========");
        System.out.println("mời bạn số lượng danh sách:");
        Scanner sc=new Scanner(System.in);
        int sl=sc.nextInt();
        HoaDon a;
        for(int i=0 ; i<sl;i++){

            System.out.println("Mời bạn chọn hộ sử dụng 1:Hộ bình thường 2:hộ kinh doanh");
            int luachon=sc.nextInt();
            if(luachon==1){
                a=new HoBinhThuong();
                a.nhap();
                arr.add(a);
            }
             else if(luachon==2){
                a=new HoKinhDoanh();
                a.nhap();
                arr.add(a);
             }
            }
        }
        public void xuat(){
            float tongtien=0;
            for(HoaDon a:arr){
                tongtien+=a.tinhtien();
                a.xuat();
            }
            System.out.println("=========");
            System.out.println("tổng tiền các hộ dùng: "+tongtien);
        }
    public void cau3(){
        System.out.println("cau 3");
        double tongtienthanhtoan=arr.stream().mapToDouble(HoaDon::tinhtien).sum();
        System.out.println("tong tien"+tongtienthanhtoan);
    }
    public void cau4(){
        float max=0;
        for(HoaDon a:arr){
            float max_dien=a.getChiSoMoi()-a.getChiSoCu();
            if(max_dien>max && a instanceof HoKinhDoanh)
                max=max_dien;
        }

        //cách 2
     //   arr.stream().filter()
        System.out.println("max điện:"+max);
    }
    public void hokinhdoanhnhieunhat(){
        System.out.println("++++hộ dùng nhiều tiền nhất++++++");
        float max=0;
        for(HoaDon a:arr){
            if(a.tinhtien()>max ){
                max=a.tinhtien();
            }
        }
        for (HoaDon a:arr){
            if(max==a.tinhtien()&& a instanceof HoKinhDoanh){
                a.xuat();
            }
        }

    }


    }


