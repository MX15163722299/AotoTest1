package com.company.one;

public class demo01 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++;
        System.out.println(b);
        int c =++a;
        System.out.println(c);
//与或非，短路运算
        int d = 5;
        boolean e = (d<4)&&(d++<4);
        System.out.println(e);



    }
}
