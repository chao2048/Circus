package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird bird = (Bird) d;  // upcasting
        getToSpeak(bird);

        Animal animal = (Animal) bird; // upcasting
        getToSpeak(animal);

        Duck duck2 = (Duck) animal; // downcasting
        getToSpeak(duck2);

        train(new Duck());
<<<<<<< HEAD:src/main/java/circus/Trainer.java
        // train(new animal.Parrot());
=======
        train(new Parrot());

        //Animal animal1 = new Animal();
        Bird bird1 = new Bird();

>>>>>>> in-lecture:src/main/java/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
<<<<<<< HEAD:src/main/java/circus/Trainer.java
=======
        } else {
            System.out.println("Not a duck!");
>>>>>>> in-lecture:src/main/java/Trainer.java
        }
    }
}
