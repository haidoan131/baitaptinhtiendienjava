package thu3;

import java.util.*;

public class Test {
    public void test_hashcodepoint(){
        Map<Point,String> pointMap=new HashMap<>();
        Point p1=new Point(1,2);
        Point p2=new Point(1,2);
        Point p3=new Point(3,4);
        pointMap.put(p1,"Point 1");
        pointMap.put(p3,"Point 2");
        //in ra ket qua kiem tra
        System.out.println("map contains p2 "+pointMap.containsKey(p2));
    }
    public void test_hashcod_person(){
        Person p1=new Person("Alice",30);
        Person p2=new Person("Alice",30);
        Person p3=new Person("Bob",25);

        //sử dụng hashset để kiểm tra equals và hashcode
        Map<Person,Integer> map=new HashMap<>();
        map.put(p1,1);
        map.put(p3,3);
        //in ra kết quả kiếm tra
        System.out.println("map contains p2 "+map.containsKey(p2));
        System.out.println("map content "+map);
    }
    public void test_optional(){
        //tạo các đối tượng optional
        Optional<String> optionalvalue=Optional.of("Hello Word");
        Optional<String> emtyoptional=Optional.empty();

        //sử dụng các phương thức optional
        System.out.println("optional is present "+emtyoptional.isPresent());
        optionalvalue.ifPresent(value-> System.out.println("value:"+value));
        //lấy gi trị hoặc gi trị thay thế
        String value=emtyoptional.orElse("defailt value");
        System.out.println("value or default "+value);
        //giá trị thay thế  supplier
        String generatedvalue=emtyoptional.orElseGet(()->"generated default value");
        System.out.println("generated value "+generatedvalue);

        //giá trị từ optional nếu có hoặc ném ngoại lệ nếu không có
        try{
            String result=emtyoptional.orElseThrow(()->new IllegalArgumentException("value not persent"));
        }
        catch (Exception e){
            System.out.println("caught exception "+e.getMessage());
        }

    }
    public void generic1(){
        Box<String> stringBox=new Box<>();
        stringBox.setContent("hello generic");
        System.out.println("String content "+stringBox.getContent());
        //tạo box cho integer
        Box<Integer> integerBox=new Box<>();
        integerBox.setContent(123);
        System.out.println("integer content"+integerBox.getContent());
        Integer[] intArray={1,2,3,4};
        String[] strArray={"A","B","C"};

        //gọi phương thức generic
        printArray(intArray);
        printArray(intArray);

        //tạo danh sách số nguyên
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        //in danh sách

        for(Integer item:integerList){
            System.out.println(item);
        }
        Pair<String,Integer> pair=new OrderedPair<>(25,"age");

        System.out.println("key"+pair.getKey()+"value"+pair.getValue());
    }
    public <T> void printArray(T[] array){
        for(T element :array)
            System.out.printf(element+" ");
        System.out.println("");
    }
}
