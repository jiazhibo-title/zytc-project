package com.zytc.demo.config;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        int r = 1;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            String str = scan.next();
            String[] num = str.split(",");
            m = Integer.parseInt(num[0]);
            n = Integer.parseInt(num[1]);
        }
        while(r != 0){
            r = m%n;
            m = n;
            n = r;
        };
        System.out.println("CDE="+m);
    }
}
