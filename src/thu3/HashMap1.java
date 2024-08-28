package thu3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class HashMap1 {
    public void test1(){
        HashMap<String,String> map=new HashMap<>();
        map.put("USA","Washington DC");
        map.put("France","Paris");
        map.put("Japan","Tokyo");
        //kiểm tra sự tồn tại của một khóa
        if(map.containsKey("France"))
        {
            System.out.println("");
        }
        //kiểm tra sự tồn tại của một giá trị
        map.containsValue("tokyo");
        //xóa một phần tử
        map.remove("japan");
        //in ra các phần tử còn lại trong hashmap
        for(String key : map.keySet()){
            System.out.println("");
        }
        //lặp qua các cặp khóa-giá trị bằng cách sử dụng entrySet()
        for(Map.Entry<String,String> entry :map.entrySet()){
            String key=entry.getKey();
            String value=entry.getValue();
        }

        //lấy giá trị với khóa có sẵn
        map.getOrDefault("USA","not found" );
        //thêm hoặc cập nhật giá trị nếu không có mặt thay đổi kiểu giá trị thành string


        //cap nhat gia tri nếu khóa có mặt
        map.computeIfPresent("France",(k,v)->v+"updated");
    }

    public void test2_countWords(){
        String s="xin chào xin xin chào";
        HashMap<String,Integer> map=new HashMap<>();
        String []words=s.split(" ");
        for(String x:words){
            int count=map.getOrDefault(x,0);
            map.put(x,count+1);
        }
        for(String key:map.keySet()){
            System.out.println(key+": "+map.get(key));
        }

    }

    public void test3_countwords(){
        String s="xin chào xin xin chào";
        HashMap<String , Integer> map=new HashMap<>();
        StringTokenizer token=new StringTokenizer(s);
        while(token.hasMoreTokens()){
            String word=token.nextToken();
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String key:map.keySet()){
            System.out.println(key+": "+map.get(key));
        }

    }
    public void test4_dictionary(){
        HashMap<String,String> dictionary=new HashMap<>();
        dictionary.put("apple","apple ngon");
        dictionary.put("banana","banana ngon");
        dictionary.put("cherry","cherry ngon");
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập từ cần tra cứu");
        String name=sc.nextLine();
        String res=dictionary.get(name);
        if(res!=null)
            System.out.println(name+" "+res);
        else System.out.println("not found");
    }
    public void test5_stream(){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("USA",3);
        map.put("France",7);
        map.put("Japan",2);
        map.put("vietnam",25);
        //in ra các phần tử
        for(String key:map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
        map.entrySet().stream()
                .forEach(item-> System.out.println(item.getKey()+":"+item.getValue()));

        //tinh tong so luong
        int kq=map.values().stream()
                .mapToInt(Integer::intValue).sum();

        //locj cacs quoc gia
        Map<String,Integer> newMap=map.entrySet().stream()
                .filter(item->item.getValue()>5)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        Map<String,Integer> newMap1=map.entrySet().stream()
                .filter(item->item.getValue()>5)
                .collect(Collectors.toMap(
                        entry->entry.getKey(),
                        entry->entry.getValue()
                ));

    }



}
