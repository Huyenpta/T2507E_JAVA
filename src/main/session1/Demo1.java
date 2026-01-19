package main.session1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        int x = 10;
        float y = 3.14f;
        double z = 3.14159;
        boolean t = true;
        char c = 'h';
        String s = "Hello World";
        System.out.println(s+x); //string + number = string (giống JS)
        int u = 20;
        int v = 30;
        System.out.println(u+"+"+v+"="+add(u,v));
        System.out.println(u+"/"+v+"="+div(u,v));

        //Nhập vào 1 số từ bàn phím
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        //Kiểm tra có phải số nguyên tố hay không
        //Thông báo kết quả
        if(isPrime(n)){
            System.out.println(n+" is a Prime!");
        }else {
            System.out.println(n+" is not a Prime");
        }
        double p;
        p = sc.nextDouble();
        System.out.println("p=");
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static double div(int a, int b){
        if (b==0) return 0;
        return (double) a /b;
    }
    //viết hàm kiểm tra một số có phải là số nguyên tố không
    public static boolean isPrime(int a){
        if (a<2) return false;
        if (a<4) return true;
        for (int i=2; i<=a/2; i++){
            if (a%i==0)
                return false;
        }
        return true;
    }
}


