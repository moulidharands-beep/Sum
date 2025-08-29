
class Elephant {
    void eat() {
        System.out.println("Elephant is eating grass.");
    }
}

class BabyElephant extends Elephant {
    void play() {
        System.out.println("Baby elephant is playing.");
    }
}

class BabyAfricanElephant extends BabyElephant {
    void trumpet() {
        System.out.println("Baby African elephant is trumpeting.");
    }
}

public class Main {
    public static void main(String[] args) {
        Elephant e = new Elephant();
        e.eat();
        System.out.println();
        BabyElephant be = new BabyElephant();
        be.eat();   
        be.play();  
        System.out.println();

        
        bae.eat();      
        bae.play();    
        bae.trumpet();   
    }
}


