// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

// Intermediate class (inherits from Vehicle)
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Derived class (inherits from Car)
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging");
    }
}

// Main class to test
public class MultiLevelInheritance {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.start();    
        e.drive();    
        e.charge();   
    }
}// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

// Intermediate class (inherits from Vehicle)
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Derived class (inherits from Car)
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging");
    }
}

// Main class to test
public class MultiLevelInheritance {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.start();    
        e.drive();    
        e.charge();   
    }
}

