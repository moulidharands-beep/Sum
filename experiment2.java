// Parent class
class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class to test
public class SingleLevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();  // Inherited from Animal
        d.bark();   // Defined in Dog
    }
}
