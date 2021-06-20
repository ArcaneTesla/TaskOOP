package com.company;
import java.util.Scanner;

public class Task_1_6 {
    public static void main(String[] args){
        System.out.print("количество квадратных метров: \n");
        Scanner console = new Scanner (System.in);
        String n = console.next();
        System.out.print("Введите ширину стены: \n");
        String w = console.next();
        System.out.print("Введите высоту стены: \n");
        String h = console.next();
        howManyWalls(n,w,h);
    }

    public static void howManyWalls(String n,String w,String h){
        Integer n1 = Integer.valueOf(n);
        Integer w1 = Integer.valueOf(w);
        Integer h1 = Integer.valueOf(h);
        Integer wall = w1 * h1;
        Integer kraska = n1 / wall;
        System.out.println("Можно покрасить ровно:" + kraska);
    }
}
