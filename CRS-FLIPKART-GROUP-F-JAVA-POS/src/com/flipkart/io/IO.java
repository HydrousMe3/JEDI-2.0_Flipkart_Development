package com.flipkart.io;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welsome to crs");
        System.out.println("1. Login");
        System.out.println("2. Reg for students");
        System.out.println("3. Update pswd");
        System.out.println("4. Exit");
        
        int ch = 0;
        
        while(ch != 4) {
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    break;
                
                case 2:
                    break;

                case 3:
                    break;

                default:
                    break;
            }
        }

        
        sc.close();
    }
}
