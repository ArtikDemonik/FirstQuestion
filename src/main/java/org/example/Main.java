package org.example;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type x (x in [-1;1]:");
        double x = in.nextDouble();
        if((-1<x)&(x>1)){
            System.out.println("x not in the range");
            return;
        }
        System.out.println("Type n:");
        double n = in.nextDouble();
        double sum = n/2;
        for(int i = 0; i <= n ; i++){
            sum += (pow(-1, i+1)+pow(x, 2*i+1))/(2*i+1);
        }
        System.out.printf("Result: %f", sum);
    }
}
