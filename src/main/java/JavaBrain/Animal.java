package JavaBrain;

import static JavaBrain.cat.nonStop;

// polymorphism
public class Animal {
    public void animalSound() {
        System.out.println("Animals make sound");
    }

}

class duck extends Animal {
    public void animalSound() {
        System.out.println("quak, quak, quak");
    }
}

class cat extends Animal {
    public void animalSound() {
        System.out.println("meew, meew");
    }
    public  static void nonStop() {
        while (true) {
            System.out.println("I wont stop");
            break; // if no break, i won't stop
        }
    }
}


class main {
    public static void main(String[] args) {
        Animal an = new Animal();
        Animal dc = new duck();
        Animal ct = new cat();
        an.animalSound();
        dc.animalSound();
        ct.animalSound();
        nonStop();
    }


}