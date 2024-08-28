package Thu4OnTapOOP.BaiTapNhomMau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachNhomMau {
    private List<NhomMau> arr=new ArrayList<>();
    public void nhap(){
        System.out.print("mời bạn nhập số lượng nhóm máu của nhóm người:");
        Scanner sc=new Scanner(System.in);
        int sl=sc.nextInt();
        for(int i=1;i<=sl;i++){
            System.out.println("mời bạn chọn nhóm máu");
            System.out.println("1:A ,2:AB ,3:B,4:O ");
        }
    }

}
