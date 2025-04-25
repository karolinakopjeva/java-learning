package lv.acodemy;

public class ThirdLessonPartTwo {
    public static void main(String[] args) {

        int summa = add(10,30);
        System.out.println(summa);

        System.out.println(add(20, 10));

        greet("Karolina");

        var rez = add(10, 5, 10);
        System.out.println(rez);

        var i = maxOfTwo(10, 30);
        System.out.println(i);

        var o = maxOfThree(10, 20,40);
        System.out.println(o);

        //methods in java - povtornoe ispoljzovanie koda
    }

    // metodi vsegda idut za klassom main!!!
    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    // exercise: maxOfTwo inta, int b, return the biggest number
    public static int maxOfTwo (int a, int b ) {
        return Math.max(a, b);
    }

    // maxOfThree, int a, int b, int c, returns biggest number
    public static int maxOfThree (int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void greet(String name) {
        System.out.println("Hello," + name + "!");
    }
}
