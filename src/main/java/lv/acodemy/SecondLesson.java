package lv.acodemy;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        String name = "Karolina";
        int age = 30;

        // Array
         int[] numbers = new int[5];
         String[] names = {"John", "Andrey", "Mark"};

         int[] ages = {19, 20, 30, 41,50};
         String[] fruitBasket = new String[10];

         // Element access
        System.out.println(numbers[0]);
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 40;
        numbers[3] = 70;
        numbers[4] = 100;
        System.out.println(Arrays.toString(numbers));

        // Exercise: full-fil fruitBasket with fruits
        fruitBasket [0] = "watermelon";
        fruitBasket [1] = "kiwi";
        fruitBasket [2] = "grape";
        fruitBasket [3] = "pear";
        fruitBasket [4] = "orange";
        fruitBasket [5] = "melon";
        fruitBasket [6] = "guawa";
        fruitBasket [7] = "bananas";
        fruitBasket [8] = "strawberry";
        fruitBasket [9] = "berries";
        System.out.println(Arrays.toString(fruitBasket));

        var currentDay = 14;
        System.out.println(currentDay);

        // Loops (cikli)
        // Print hello world 5 times;
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        // for loop (kogda znem skoljko raz hotim povtoritj cikl, mozhem govoritj uslovija)
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        for(int i = 0; i < fruitBasket.length; i++) {
            System.out.println(fruitBasket[i]);
        }

        // for each; pechataet vse shto jestj
        for(String fruit : fruitBasket) {
            System.out.println(fruit);
        }

        // for (schetchik; uslovie, rabotaet poka ono true, pri false ostanovitsa; schetchik i++)

        //exercise create int number array from 0 -> to 10; print in reverse order
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = nums.length -1; i >= 0; i-- ) {
            System.out.print(i + " ");
        }

        // Concatenation (skleivanie strok)
        String myName = "Karolina";
        String mySurname = "Kopjeva";
        int myAge = 30;
        System.out.println("n");
        // My name is Karolina Kopjeva. I am 30 years old.
        System.out.println("My name is " + myName + " " + mySurname + ". Iam " + myAge + " years old.");
         // String.format();
        System.out.println(
               String.format ("My name is %s %s. I am %d years old" , myName, mySurname, myAge));

        String template = """
                My name is %s %s. I am %d  years old""";
        System.out.println(String.format(template, myName, mySurname, myAge));

        // while loops - preduslovnij cikl, snachala vipolnjaet uslovija, potom cikl
        // ego ispoljzujut kogda mi ne znaem tochnoe kol-vo operacij

        int i = 0;
        while(i < 5) {
            System.out.println("Number: " + i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        String password = "";

        while (!password.equals("secret")) {
            System.out.println("Enter your password:");
            password = scanner.nextLine();
        }
        System.out.println("Access granted!");

        // do while (snachala ispolnjaem shto-to, potom proverjaem uslovija)
        int randomNumber = new Random().nextInt(0, 11);
        System.out.println("Random number:" + randomNumber);
        int guess;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println("Guess number from 1 to 10");
            guess = myScanner.nextInt();
        } while (guess != randomNumber);

        System.out.println("Guessed!");

        // Vivesti tablicu umnozhenija na 5
        for (int o = 1; o <= 10; o++) {
            System.out.println("5 * " + o + " = " + (5 * o));
        }

        // poschitatj summu chisel ot 1 do 100;
        int sum = 0;
        for(int p = 1; p <= 100; p++) {
            sum = sum + p;
            System.out.println("Summa;" + sum);
        }

        // While - vivesti chisla ot 10 do 1
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
