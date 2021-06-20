package com.company;
import java.util.Scanner;

public class Task_1_5 {
    public static void main(String[] args){
        System.out.print("Введите логическое значение a: \n");
        Scanner console = new Scanner (System.in);
        String a = console.next();
        System.out.print("Введите логическое значение b: \n");
        String b = console.next();
        System.out.println(and(a,b));
    }

    public static boolean and(String a,String b){
        Boolean a1 = Boolean.valueOf(a);
        Boolean b1 = Boolean.valueOf(b);
        return (a1 && b1);
    }
}
