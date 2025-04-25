package lv.acodemy;

public class Dog {
     private String name;
    private int age;
    private String breedName = "unknown breed"; //izmenjaem cherez konstruktor // uknown breed, budet dlja teh objektov, u kogo ne ukazana poroda i togda podefoltu on budet eto pechatatj

    public Dog(String breedName) {
        this.breedName = breedName;
    }

    public Dog() {
    }

    public Dog(String name, int age, String breedName) {
        this.name = name;
        this.age = age;
        this.breedName = breedName;
    }

    void bark() {
        System.out.println(name + " says Woof-woof!");
    }

    void feed() {
        System.out.println(name + " eating some food!");
    }

    // Getter and Setter - gde setter ukazivaet, shto mi mozhem shto-to menjatj, a getter, shto mozhem poluchitj dannie

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreedName() {
        return breedName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breedName='" + breedName + '\'' +
                '}';
    }
}
