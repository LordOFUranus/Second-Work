package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String string4Void;
        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первое задание: "+compareTwoNumber(1,10));

        numValue(-3);
        System.out.println("Третье задание: "+ positiveNum(3));

        System.out.println("Четвертое задание - введите строку");
        string4Void = scanner.nextLine();
        System.out.println("Введите количество раз, которых вы хотите напечатать");
        a = scanner.nextInt();
        printString(string4Void,a);
        scanner.close();
        System.out.println(years(400));
    }

    public static boolean compareTwoNumber(int a, int b){
        int sum = a+b;
        if(sum>=10 && sum<=20) return true;
        else return false;
    }

    public static void numValue(int a){
        System.out.print("Второе задание: ");
        if(a>0) System.out.print("Число "+a+" - это пложительное число \n");
        else if(a==0) System.out.print(a +" равен нулю\n");
        else System.out.printf("Число %d - это отрицательное число \n", a);
    }

    public static boolean positiveNum(int a){
        if(a>= 0)return false;
        else return true;
    }

    public static void printString(String string, int a){
        for(int i = 0; i<a; i++){
            System.out.printf("Строка - \"%s\" напечатана %d раз \n",string,i+1);
        }
    }

    public static boolean years(int years){
        if(years %4 == 0 && years !=100 || years == 400){
            System.out.print("Пятое задание: Год высокосный - ");
            return true;
        }
        else System.out.print("Пятое задание: Год не высокосный - ");
        return false;

    }

   /*public static boolean numValue(int a){ /// - альтернативный медот для решения второго и третьего задания сразу
        if(a>=0){
            System.out.println("Число "+a+" - это пложительное число \n");
            return false;
        }
        else{
            System.out.printf("Число %d - это отрицательное число \n", a);
            return true;
        }
    }*/

}
