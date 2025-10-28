package zadania;
import animals.*;
import java.util.*;

public class Zoo {
    Animal[] animals = new Animal[100];
    public Zoo() {
        fillTheZoo();
        sumaNog();
    }
    public void fillTheZoo() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int random = rand.nextInt(3);
            switch (random) {
                case 0:
                    animals[i] = new Snake();
                    break;
                case 1:
                    animals[i] = new Dog();
                    break;
                case 2:
                    animals[i] = new Parrot();
                    break;
            }
            animals[i].getDescription();
            animals[i].makeSound();
        }
    }
    public int sumaNog() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += animals[i].legs;
        }
        System.out.println("Suma: " + sum);
        return sum;
    }

    static void main() {
        Zoo zoo = new Zoo();
    }
}




