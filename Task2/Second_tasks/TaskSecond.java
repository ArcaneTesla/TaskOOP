package ru.Task.Second_tasks;

public class TaskSecond {
    public static void main(String[] args) {
        //Task1
        System.out.print(oppositeHouse(1, 3));
        System.out.println();
        System.out.print(oppositeHouse(2, 3));
        System.out.println();
        System.out.print(oppositeHouse(3, 5));
        System.out.println();
        System.out.print(oppositeHouse(5, 46));
        System.out.println();
        //Task2
        System.out.print(nameShuffle("Donald Trump"));
        System.out.println();
        System.out.print(nameShuffle("Rosie O'Donnell"));
        System.out.println();
        System.out.print(nameShuffle("Seymour Butts"));
        System.out.println();
        //Task3
        double rez = discount(1500, 50);
        System.out.println(rez);
        double rez1 = discount(89, 20);
        System.out.println(rez1);
        double rez2 = discount(100, 75);
        System.out.println(rez2);
        //Task4
        int[] array = new int[]{10, 4, 1, 4, -10, -50, 32, 21};
        differenceMaxMin(array);
        int[] Secondarray = new int[]{44, 32, 86, 19};
        differenceMaxMin(Secondarray);
        //Task5
        int result = equal(3, 4, 3);
        System.out.println(result);
        result = equal(1, 1, 1);
        System.out.println(result);
        result = equal(3, 4, 1);
        System.out.println(result);
        //Task6
        for (int counter = 0; counter < args.length; counter++) {
            String string = args[counter];
            String reverseString = reverseString(string);
            System.out.println(reverseString);
        }
        //Task7
        programmers(147, 33, 526);
        programmers(33, 72, 74);
        programmers(1, 5, 9);
        //Task8
        getXO("ooxx");
        getXO("xooxx");
        getXO("ooxXm");
        getXO("zpzpzpp");
        getXO("zzoo");
        //Task9
        bomb("There is a bomb.");
        bomb("Hey, did you think there is a BOMB?");
        bomb("This goes boom!!!");
        //Task10
        sameAscii("a", "a");
        sameAscii("AA", "B@");
        sameAscii("EdAbIt", "EDABIT");
    }
// 1. Теша шел по прямой улице, по обеим сторонам которой стояло ровно n
// одинаковых домов. Номера домов на улице выглядят так:
// 1 | | 6
// 3 | | 4
// 5 | | 2
// Она заметила, что четные дома увеличиваются справа, а нечетные уменьшаются слева.
// Создайте функцию, которая принимает номер дома и длину улицы n и возвращает номер
// дома на противоположной стороне.
//Пример:
// oppositeHouse(1, 3) ➞ 6
// oppositeHouse(2, 3) ➞ 5
// oppositeHouse(3, 5) ➞ 8
// oppositeHouse(5, 46) ➞ 88
    private static int oppositeHouse(int FirstNumber, int SecondNumber) {
        return (SecondNumber * 2 - FirstNumber + 1);
    }

//2. Создайте метод, который принимает строку (имя и фамилию человека) и
// возвращает строку с заменой имени и фамилии.
// Пример:
// nameShuffle("Donald Trump") ➞ "Trump Donald"
// nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"
// nameShuffle("Seymour Butts") ➞ "Butts Seymour"

    private static String nameShuffle(String name_surname) {
        String[] words = name_surname.split(" ");
        return words[1]+""+words[0];
    }

//3. Создайте функцию, которая принимает два аргумента: исходную цену и процент
// скидки в виде целых чисел и возвращает конечную цену после скидки.
// Пример:
// discount(1500, 50) ➞ 750
// discount(89, 20) ➞ 71.2
// discount(100, 75) ➞ 25
    private static double discount(double sum, double persent) {
        return sum - sum * persent / 100;
    }

//4. Создайте функцию, которая принимает массив и возвращает разницу между
// наибольшим и наименьшим числами.
// Пример:
// differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.
// differenceMaxMin([44, 32, 86, 19]) ➞ 67
// Smallest number is 19, biggest is 86.
    private static int differenceMaxMin(int[] array) {

        int maximum = 1000;
        int minimum = 1000;

        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] > maximum) {
                maximum = array[counter];
            }
            if (array[counter] < minimum) {
                minimum = array[counter];
            }
        }
        return maximum-minimum;
    }

    //5.Создайте функцию, которая принимает три целочисленных аргумента (a, b, c) и
// возвращает количество целых чисел, имеющих одинаковое значение.
// Пример:
// equal(3, 4, 3) ➞ 2
// equal(1, 1, 1) ➞ 3
// equal(3, 4, 1) ➞ 0
    private static int equal(int a, int b, int c) {

        if ((a==b) && (b==c) && (a==c)){
            return 3;
        }
        else {
            if ((a==b) || (a==c) || (c==b)){
                return 2;
            }

        }
        return 0;
    }

    //6. Создайте метод, который принимает строку в качестве аргумента и возвращает ее в
// обратном порядке.
// Пример:
// reverse("Hello World") ➞ "dlroW olleH"
// reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"
// reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"
    public static String reverseString(String word) {
        String string = "";
        int length = word.length();

        for (int counter = length - 1; counter >= 0; counter--) {
            string += word.charAt(counter);
        }

        return string;
    }

    //7. Вы наняли трех программистов и (надеюсь) платите им. Создайте функцию,
// которая принимает три числа (почасовая заработная плата каждого программиста)
// и возвращает разницу между самым высокооплачиваемым программистом и самым
// низкооплачиваемым.
// Пример:
// programmers(147, 33, 526) ➞ 493
// programmers(33, 72, 74) ➞ 41
// programmers(1, 5, 9) ➞ 8
    private static int programmers(int first, int second, int third) {
        int minimum = 1000;
        int maximum = 0;

        if (first>maximum){
            maximum = first;
        }
        if (second>maximum) {
            maximum = second;
        }
        if (third>maximum){
            maximum = third;
        }

        if (first<minimum){
            minimum = first;
        }
        if (second<minimum) {
            minimum = second;
        }
        if (third<minimum){
            minimum = third;
        }

        return maximum - minimum;

    }

    //8. Создайте функцию, которая принимает строку, проверяет, имеет ли она одинаковое
// количество x и o и возвращает либо true, либо false.
// Правила:
// - Возвращает логическое значение (true или false).
// - Верните true, если количество x и o одинаковы.
// - Верните false, если они не одинаковы.
// - Строка может содержать любой символ.
// - Если "x" и "o" отсутствуют в строке, верните true.
// Пример:
// getXO("ooxx") ➞ true
// getXO("xooxx") ➞ false
// getXO("ooxXm") ➞ true
// Case insensitive.
// getXO("zpzpzpp") ➞ true
// Returns true if no x and o.
// getXO("zzoo") ➞ false
    private static boolean getXO(String string) {
        int k = 0; int m = 0;

        //  преобразование строки в массив символов
        char [] letter = string.toCharArray();
        for (int counter = 0; counter < string.length(); counter++) {
            if ((letter[counter] == 'x') || (letter[counter] == 'X')) {
                k = k + 1;
            }
            if ((letter[counter] == 'o') || (letter[counter] == 'O')) {
                m = m+1;
            }
        }
        return (m == k);
    }

    //9. Напишите функцию, которая находит слово "бомба" в данной строке. Ответьте
// "ПРИГНИСЬ!", если найдешь, в противном случае:"Расслабься, бомбы нет".
// Пример:
// bomb("There is a bomb.") ➞ "DUCK!"
// bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"
// bomb("This goes boom!!!") ➞ "Relax, there's no bomb."
// Примечание:
// Строка "бомба" может появляться в разных случаях символов (например, в верхнем,
// нижнем регистре, смешанном).
    private static String bomb(String word) {
        if (word.contains("bomb") || word.contains("BOMB")) {
            return "DUCK!";
        }
        else{
            return "Relax, there's no bomb.";
        }
    }

    //10. Возвращает true, если сумма значений ASCII первой строки совпадает с суммой
// значений ASCII второй строки, в противном случае возвращает false.
// Пример:
// sameAscii("a", "a") ➞ true
// sameAscii("AA", "B@") ➞ true
// sameAscii("EdAbIt", "EDABIT") ➞ false
    private static boolean sameAscii(String first_string, String second_string) {
        // преобразование строки в массив символов, затем кидаем в массив
        char[] first = first_string.toCharArray();
        char[] second = second_string.toCharArray();
        int firstsum = 0, secondsum = 0;
        for (int counter = 0; counter < first.length; counter++) {
            firstsum = firstsum +first[counter];
        }
        for (int counter = 0; counter < second.length; counter++) {
            secondsum= secondsum + second[counter];
        }
        System.out.println(firstsum);
        System.out.println(secondsum);
        return (firstsum == secondsum);
    }

}
