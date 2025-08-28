
class Elephant {
    void eat() {
        System.out.println("Elephant is eating grass.");
    }
}

// First level derived class (Single Inheritance)
class BabyElephant extends Elephant {
    void play() {
        System.out.println("Baby elephant is playing.");
    }
}

// Second level derived class (Multilevel Inheritance)
class BabyAfricanElephant extends BabyElephant {
    void trumpet() {
        System.out.println("Baby African elephant is trumpeting.");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating object of base class
        Elephant e = new Elephant();
        e.eat();
        System.out.println();

        // Creating object of first derived class (Single Inheritance)
        BabyElephant be = new BabyElephant();
        be.eat();   // Inherited from Elephant
        be.play();  // Own method
        System.out.println();

        // Creating object of second derived class (Multilevel Inheritance)
        BabyAfricanElephant bae = new BabyAfricanElephant();
        bae.eat();       // From Elephant
        bae.play();      // From BabyElephant
        bae.trumpet();   // Own method
    }
}
