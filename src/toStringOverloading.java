public class toStringOverloading {
    public static void main(String[] args) {
        Human h1 = new Human("Tom",40);
        System.out.println(h1);
    }
}
class Human {                  // the new class
    private String name;
    private int age;

    public Human(String name, int age) {           // Constructor
        this.name = name;
        this.age = age;
    }

    public String toString() {    // Overloading the method toString()
        return name + ", " + age;
    }
}

