package com.onjug.beginner;
import java.io.PrintStream;
import java.util.Scanner;

public class SimpleCalculate {


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int code;
        int numberOfUnits;
        double price;
        double valor;

        code = sc.nextInt();
        numberOfUnits = sc.nextInt();
        price = sc.nextDouble();
        valor = numberOfUnits * price;

        code = sc.nextInt();
        numberOfUnits = sc.nextInt();
        price = sc.nextDouble();
        valor += numberOfUnits * price;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);

    }
}
