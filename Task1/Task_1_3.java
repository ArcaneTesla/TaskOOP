package com.company;
import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args){
        System.out.print("Введите количество Побед: \n");
        Scanner console = new Scanner (System.in);
        String win = console.next();
        System.out.print("Введите количество ничьих: \n");
        String pat = console.next();
        System.out.print("Введите количество проигрышей: \n");
        String lose = console.next();
        match(win,pat,lose);
    }

    public static void match(String win, String pat, String lose){
        Integer winP = Integer.valueOf(win);
        Integer patP = Integer.valueOf(pat);
        Integer loseP = Integer.valueOf(lose);
        winP *= 3;
        loseP *= 0;
        Integer matchP = winP+loseP+patP;

        System.out.println("Команда набрала: " + matchP + " очков");
    }
}
