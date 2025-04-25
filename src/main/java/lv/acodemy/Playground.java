package lv.acodemy;

public class Playground {
    public static void main(String[] args) {

        Dog rex = new Dog();
        //netu imeni
        //net age
        // breed - unknown breed

        // Encapsulation - kogda mi zapreshaem menjatj objekt naprjamuju i hotim davatj menjatj toljko opredelennie metodi
        // to, shto ne mozhem menjatj porodu naprimer, ili imja
        rex.setName("Rex");
        rex.setAge(1);

        rex.bark();
        rex.feed();

        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        System.out.println(rex.getBreedName());

        Dog barsik = new Dog("Alabai");
        // name = null
        // netu age = 0
        // breedName = unknown breed

        barsik.setName("Barsik");
        barsik.setAge(1);
        // a na etom momente, mi uzhe dali dannie dlja Barsika

        System.out.println(barsik.getName());
        System.out.println(barsik.getAge());

        // raspechatatj nazvanie porodi cherez metod
        System.out.println(barsik.getBreedName());

        // all argumetn constructor (kogda mi mozhem vse parametri zadatj srazu)
        Dog myDog = new Dog("Shkiper", 11, "JackRussel");
        System.out.println(myDog);

        //exercise:
        // car object
        Car bmw = new Car("320");
        System.out.println(bmw);
        bmw.drive();
        System.out.println(bmw);
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        System.out.println(bmw);
        bmw.refuel();
        bmw.refuel();
        bmw.refuel();
        bmw.refuel();
        bmw.refuel();
        bmw.refuel();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.service();
        bmw.service();
        bmw.service();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.refuel();
        bmw.refuel();
        bmw.refuel();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        bmw.drive();
        System.out.println(bmw);

    }

}
