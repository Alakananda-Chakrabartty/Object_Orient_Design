/** Name : Alakananda Chakrabartty
 * Student ID : 220206
 * This program demonstrates the Liskov Substitution Principle (LSP) by creating a system
 * where different types of birds can fly, but penguins, being flightless birds, have a different behavior.
 */

// Bird interface representing different types of birds
interface Bird {
    /**
     * Makes the bird fly.
     */
    void fly();
}

// FlyingBird class implementing the Bird interface
class FlyingBird implements Bird {
    /**
     * Makes the flying bird fly.
     */
    @Override
    public void fly() {
        System.out.println("Flying bird is flying.");
    }
}

// Penguin class, a subtype of Bird, representing flightless birds
class Penguin implements Bird {
    /**
     * Penguins cannot fly, so this method does nothing.
     */
    @Override
    public void fly() {
        // Penguins cannot fly, so do nothing
    }
}

// BirdTrainer class responsible for training birds to fly
class BirdTrainer {
    /**
     * Trains the given bird to fly.
     * @param bird The bird to be trained.
     */
    public void trainBirdToFly(Bird bird) {
        bird.fly();
    }
}

// Main class
public class LSPDemo {
    public static void main(String[] args) {
        // Create a BirdTrainer instance
        BirdTrainer birdTrainer = new BirdTrainer();

        // Create a FlyingBird instance and train it to fly
        Bird flyingBird = new FlyingBird();
        birdTrainer.trainBirdToFly(flyingBird);

        // Create a Penguin instance and attempt to train it to fly
        Bird penguin = new Penguin();
        birdTrainer.trainBirdToFly(penguin); // Penguins cannot fly, but this violates LSP
    }
}

/**
 * In this program:
 * The Bird interface represents different types of birds
 * and declaresa method fly() to make the bird fly.
 * The FlyingBird class implements the Bird interface and provides
 * an implementation of the fly() method for birds that can fly.
 * The Penguin class represents flightless birds, which
 * also implement the Bird interface. However, penguins cannot fly,
 * so the fly() method does nothing.
 * The BirdTrainer class is responsible for training birds
 * to fly by calling the fly() method on the provided Bird object.
 * The violation of Liskov Substitution Principle occurs when
 * we attempt to train a penguin, which is a subtype of Bird, to fly.
 * Penguins cannot fly, so trying to train them to fly violates the
 * expected behavior of the fly() method defined in the Bird interface.
 */
