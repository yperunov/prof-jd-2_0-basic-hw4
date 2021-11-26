package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // task1
        int countUp = 1;
        while (countUp <= 10) {
            System.out.println(countUp);
            countUp++;
        }
        System.out.println(" ");
        for (int countDown = 10; countDown > 0; countDown--) {
            System.out.println(countDown);
        }

        //task2
        int friday = 5;
        for (; friday<=31;friday=friday+7) {
            System.out.println("Сегодня пятница, "+friday+" число. Необходимо подготовить отчет");
        }

        //task3
        int yearStart = 2021-200;
        int yearFinish = 2021+100;
        for (int c=0; c<yearFinish;c=c+79){
            if (c>yearStart)
            System.out.println(c);
        }
    }
}
