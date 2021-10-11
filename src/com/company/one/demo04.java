package com.company.one;

import java.util.Scanner;

public class demo04 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        if(scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println("输出内容未："+str);

        }
    }
}
