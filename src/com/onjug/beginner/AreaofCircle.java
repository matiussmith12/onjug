package com.onjug.beginner;

import java.util.Scanner;

public class AreaofCircle {
    public static final double pi = 3.14159;

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();

        System.out.println("A=" + pi*R*R);

    }
}
