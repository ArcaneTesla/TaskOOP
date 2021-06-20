package com.company;
import java.util.Scanner;

public class Task_1_10 {
    public static void main(String[] args){
        System.out.print("Введите a: \n");
        Scanner console = new Scanner (System.in);
        String a = console.next();
        System.out.print("Введите b: \n");
        String b = console.next();

        System.out.println(mod(a, b));
    }

    public static int mod(String a,String b){
        Integer a1 = Integer.valueOf(a);
        Integer b1 = Integer.valueOf(b);
        Integer mod = a1/b1;
        Integer mod1 = a1 - mod * b1;
        return (mod1);
    }
}