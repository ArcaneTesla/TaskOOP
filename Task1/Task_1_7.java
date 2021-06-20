package com.company;
import java.util.Scanner;

public class Task_1_7 {
    public static void main(String[] args){
        System.out.print("введите число: \n");
        Scanner console = new Scanner (System.in);
        String a = console.next();
        Integer a1 = Integer.valueOf(a);
        System.out.println(squaed(a1));
    }

    public static int squaed(int a) {
        return a * a;
    }
}
