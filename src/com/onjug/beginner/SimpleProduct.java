package com.onjug.beginner;
import java.util.Scanner;

public class SimpleProduct {

    public static void main (String[] args){
        Scanner sc = new Scanner((System.in));

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("PROD = " + (A*B));
    }
}
