// Define an interface for animals that can make sounds.
interface Soundable {
    void makeSound();
}

// Define an abstract class for animals with common attributes.
abstract class Animal {
    private String name;
    private int age;

    // Constructor for initializing common attributes.
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to represent how an animal moves. Specific implementations
    // will be provided by concrete subclasses.
    public abstract void move();

    // Getter methods for common attributes.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Modify the Animal class to implement the Soundable interface.
abstract class SoundMakingAnimal extends Animal implements Soundable {
    public SoundMakingAnimal(String name, int age) {
        super(name, age);
    }
}

// Create concrete animal classes that extend the SoundMakingAnimal class.
class Lion extends SoundMakingAnimal {
    public Lion(String name, int age) {
        super(name, age);
    }

    // Implement the move method specific to a lion.
    @Override
    public void move() {
        System.out.println(getName() + " the lion is running.");
    }

    // Implement the makeSound method from the Soundable interface.
    @Override
    public void makeSound() {
        System.out.println(getName() + " the lion roars.");
    }
}

class Penguin extends SoundMakingAnimal {
    public Penguin(String name, int age) {
        super(name, age);
    }

    // Implement the move method specific to a penguin.
    @Override
    public void move() {
        System.out.println(getName() + " the penguin is swimming.");
    }

    // Implement the makeSound method from the Soundable interface.
    @Override
    public void makeSound() {
        System.out.println(getName() + " the penguin makes a honking sound.");
    }
}

// Create a Zoo class that uses object composition to manage animals.
class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    // Method to perform daily activities for all animals in the zoo.
    public void performDailyActivities() {
        for (Animal animal : animals) {
            animal.move();
            
            // Check if the animal can make a sound (implements Soundable) before calling makeSound.
            if (animal instanceof Soundable) {
                ((Soundable) animal).makeSound();
            }
        }
    }
}

public class Exp1 {
    public static void main(String[] args) {
        // Create some animals and add them to the zoo.
        Lion lion = new Lion("Simba", 5);
        Penguin penguin = new Penguin("Pingu", 2);

        Animal[] zooAnimals = { lion, penguin };

        // Create a Zoo object and initialize it with the animals.
        Zoo zoo = new Zoo(zooAnimals);

        // Perform daily activities at the zoo.
        zoo.performDailyActivities();
    }
}