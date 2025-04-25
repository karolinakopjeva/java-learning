package lv.acodemy;

public class Car {

    //fuel (0 - 100)
    // mileage (km)
    // wear (0 - 100)
    // model name

    // Create all constructor v konstruktore toljko dajom modelj

    private int fuel;
    private int mileage;
    private int wear;
    private String model;

    public Car(String model) {
        this.model = model;
        this.fuel = 50;
        this.mileage = 120;
        this.wear = 10;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                ", mileage=" + mileage +
                ", wear=" + wear +
                ", model='" + model + '\'' +
                '}';
    }

    void drive() {
        // kogda mi vizivaem drive:
        // if fuel  >= 10 && wear < 90;
        // fuel = fuel - 10;
        // mileage + 50;
        // wear + 10
        // if fuel < 10 will print npt enough fuel
        //else --> car is very used

        if(fuel >= 10 && wear < 90) {
            fuel = fuel -10;
            mileage = mileage + 50;
            wear = wear + 10;
        } else if (fuel < 10) {
            System.out.println("Not enough fuel!");
        } else {
            System.out.println("Car is very used!");
        }
    }

    // new method refuel
    // if fuel <100 => fuel + 30;
    // if fuel > 100 ==> fuel = 100;
    // else -_> tank is full
    public void refuel() {
        if(fuel < 100) {
            fuel = fuel + 30;
        } else if (fuel > 100) {
            fuel = 100;
            System.out.println(model + " is refueld");
        } else {
            System.out.println("Tank is full!");
        }
    }

    // service decrease wear on 30;
    // if wear > 0; wear = wear - 30;
    // if wear < 0 ; wear = 0;
    // print -> model + got service
    // else -> print  "in a good condition''

    void service() {
        if(wear > 0) {
            wear = wear - 30;
            if(wear < 0) wear = 0;
            System.out.println(model + " got service");
        } else {
            System.out.println("Car in a good condition");
        }
    }

    void showStatus() {
        System.out.println("Fuel: " + fuel);
    }
}
