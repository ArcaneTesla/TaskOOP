package com.company;
import java.util.Scanner;

public class Task_1_1 {
    public static void main(String[] args){
        System.out.print("Введите количество минут: \n");
        Scanner console = new Scanner (System.in);
        String n = console.next();
        int n1 = Integer.valueOf(n);

        System.out.println("Секунды: " + second(n1));
    }

    public static Integer second(Integer n1){
        n1 = n1 * 60;
        return n1;
    }
}
