package com.company.one;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //整数
        int a =10;
        int b = 010;//八进制
        int c = 0x10;//十六进制
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //浮点数
        //float
        //double

        //转译字符
        // \t空格   \n换行
        System.out.println("hello\tworld");
        System.out.println("hello\nworld");

        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);
        sa = "hello world";
        sb = "hello world";
        System.out.println(sa == sb);

        //布尔值扩展
        boolean flag = true;
        if (flag){
            System.out.println("ok");
        }



    }
}
