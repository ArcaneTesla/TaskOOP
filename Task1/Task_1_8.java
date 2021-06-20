package com.company;
import java.util.Scanner;

public class Task_1_8 {
    public static void main(String[] args){
        System.out.print("Введите prob: \n");
        Scanner console = new Scanner (System.in);
        String prob = console.next();
        System.out.print("Введите prize: \n");
        String prize = console.next();
        System.out.print("Введите pay: \n");
        String pay = console.next();
        System.out.println(profitableGamble(prob,prize,pay));
    }

    public static boolean profitableGamble(String prob,String prize,String pay){
        Double prob1 = Double.valueOf(prob);
        Integer prize1 = Integer.valueOf(prize);
        Integer pay1 = Integer.valueOf(pay);
        return (prob1 * prize1 > pay1);
    }
}
