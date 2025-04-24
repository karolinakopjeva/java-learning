package lv.acodemy;

 public class MyClass {
    public static void main(String[] args) {
        System.out.println("Ja u mami programmist!");

        // Your text is here(one line comment)

        /*
        First Line
        Second Line
        Third Line
         */

        // byte 8-bit
        byte age = 30;
        System.out.println(age);

        // short 16-bit
        short currentYear = 2025;
        short temperature = -273;
        short distance = 1600;

        // int 32-bit
        int score = 9000;
        int population = 144400000;
        int result = (10 * 10) - 42;
        System.out.println(result);

        //long 64-bit
        long starsInGalaxy = 100_000_000_000L; //1000000000L (boxing type)
        long bigNumber = 2095858374754333L;
        long currentMillis = System.currentTimeMillis();
        System.out.println(currentMillis);

        // float 32-bit
        float pi = 3.14f;
        float piNumber = (float) Math.PI; // casting
        float discount = 25.5f;

        // double 64-bit
        double accountBalance = 99999.9999944444;
        double squareRoot = Math.sqrt(2);
        System.out.println(squareRoot);
        double piDouble = Math.PI;
        System.out.println(pi);
        System.out.println(piDouble);

        // char (symbol) - toljko odin, i vsegda v ordinarnih kavichkah
        char initial = 'N';
        char digit = '7';
        char symbol = '#';

        // unicode
        char smiley = '\u263A';
        System.out.println(smiley);

        // boolean (true or false)
        boolean isJavaFun = true;
        boolean isTired = true;
        boolean passed = (40>60); // false
        System.out.println(isJavaFun);
        System.out.println(passed);

        // String
        String myFullName = "Karolina Kopjeva";
        String mfn = new String("Karolina Kopjeva");
    }
}






