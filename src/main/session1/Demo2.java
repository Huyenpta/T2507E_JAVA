package main.session1;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args){
        int[] arr = new int[]{1,2}; // khai báo 1 int array
        int[] arr1 = new int[3];
        //List - Collection (tập hợp không cần thiết gần cạnh nhau trong bộ nhớ nên kích thước linh động được)
        // int float double char boolean không sài được
        Integer a = 10;
        Float b = 3.14f;
        Double c = 3.14159;
        Character h = 'x';
        Boolean t = true;

        ArrayList ar = new ArrayList();// Không nên dùng
        ar.add(5);
        ar.add("Hello");// thêm phần tử vào mảng
        ArrayList<Integer> intArr = new ArrayList<>(); // mảng số nguyên
        intArr.add(3);
        intArr.add(6);
        //intArr.add(3.14);
        //intArr.add("Hello");
        ArrayList<Double> dbArr = new ArrayList<>();// mảng số thực
        dbArr.add(3.14);
        dbArr.add(3.16);

        for (int i=0;i<intArr.size();i++){
            System.out.println(intArr.get(i)); // intArr.get(i)
        }

        for (Double d:dbArr){
            System.out.println(d);
        }
    }

}
