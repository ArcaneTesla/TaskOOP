package com.company;
import java.util.Scanner;

public class Task_1_4 {
    public static void main(String[] args){
        System.out.print("Введите число: \n");
        Scanner console = new Scanner (System.in);
        String n = console.next();
        System.out.println(five(n));
    }

    public static boolean five(String n){
        Integer n1 = Integer.valueOf(n);
        return (n1 % 5 == 0);
    }
}
