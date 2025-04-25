package lv.acodemy;

import java.util.Arrays;

public class ThirdLesson {
    public static void main(String[] args) {

        // Conditional operators in Java

        // if (is, has -> isRaining, hasEvenValue), otrabotaet toljko pri true
        boolean isRaining = true;

        if(isRaining) {
            System.out.println("Take un umbrella!");
        }

        int temperature = 30;
        if(temperature > 29) {
            System.out.println("It is too hot");
        }

        // and
        if(4 > 2 && 10 < 11) {
            System.out.println("Both are equals!");
        }

        // or (||)
        if(4 > 2 || 10 > 11) {
            System.out.println("Execute this code");
        }

        // if-else
        boolean isWeekDay = true;

        if(isWeekDay) {
            System.out.println("Working today...");
        } else {
            System.out.println("Will stay at home!");
        }

        int number = 9;
        // % - ostatok delenija
        if(number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // jesli vozrast >= 18 --> access granted
        // v drugih sluchaj --> access denied

        int age = 18;
        if(age >= 18) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access is denied");
        }

        // if-else-if-else

        int hour = 10;
        if(hour ==5) {
            System.out.println("Willgo for run");
        } else if (hour ==7) {
            System.out.println("Will have breakfest");
        } else if (hour == 9) {
            System.out.println("Will start work");
        } else {
            System.out.println("Free time");
        }

        // score > = 90 - Perfect;
        // >= 70 - Good
        // >= 50 - Ok
        // else -> not ok

        int score = 90;
        if(score >= 90) {
            System.out.println("Perfect");
        } else if (score >=70) {
            System.out.println("Good");
        } else if (score >= 50) {
            System.out.println("Ok");
        } else {
            System.out.println("Not ok");
        }

        // we know conditions and loops
        //Print eve numbers from 1to 10;

        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println("Number:" + i + "is even number!");
            }
        }

        //Count sum only for positive numbers
        int[] numbers = {-2, -10, 5, 6, -100, 3, 0, 20};
        int sum = 0;
        for (int j : numbers) {
            if (j > 0) {
                sum = sum + j;

            }
        }
        System.out.println("Sum of positive numbers: " + sum);

        // 1 till 20
        // print numbers that can be divided by 3 and 5
        // print divided by 3
        // print divided by 5
        //else -> just print number

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + " can be divided by 3 and 5");
            } else if (i % 3 == 0) {
                System.out.println("Number " + i + " can be divided by 3");
            } else if (i % 5 == 0) {
                System.out.println("Number " + i + " can be divided by 5");
            } else {
                System.out.println(i);
            }
        }








    }
}
