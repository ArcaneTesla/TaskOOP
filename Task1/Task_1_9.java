package com.company;
import java.util.Scanner;

public class Task_1_9 {
    public static void main(String[] args){
        System.out.print("Введите минуты: \n");
        Scanner console = new Scanner (System.in);
        String min = console.next();
        System.out.print("Введите FPS: \n");
        String fps = console.next();

        System.out.println(frames(min, fps));
    }

    public static int frames(String min,String fps){
        Integer min1 = Integer.valueOf(min);
        Integer fps1 = Integer.valueOf(fps);
        return (min1 * 60 * fps1);
    }
}