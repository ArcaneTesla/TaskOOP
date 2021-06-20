package com.company;
import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args){
        System.out.print("Введите количество двухочковых: \n");
        Scanner console = new Scanner (System.in);
        String n = console.next();
        System.out.print("Введите количество трехочковых: \n");
        String n1 = console.next();
        Integer inn = Integer.valueOf(n);
        Integer inn1 = Integer.valueOf(n1);
        points(inn,inn1);
    }

    public static void points(Integer inn, Integer inn1){
        inn = inn * 2;
        inn1 = inn1 * 3;

        Integer point = inn + inn1;
        System.out.println("Команда набрала: " + point + " очков");
    }
}
