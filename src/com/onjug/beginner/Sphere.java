package com.onjug.beginner;
import java.util.Scanner;

public class Sphere {


    public static void main(String[] args){
        final double pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double volume = (4.0/3.0) * pi * (Math.pow(radius,3));

        System.out.printf("VOLUME = %.3f\n", volume);


    }
}
