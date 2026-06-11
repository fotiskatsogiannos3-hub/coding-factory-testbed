package gr.aueb.cf.cf9.ch14;

/**
 * Demonstrates polymorphic behavior using {@link Animal} subclasses.
 */
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex", 15);
        Animal cat = new Cat("Chanel", 4);

        doSpeak(dog);
        doSpeak(cat);

        System.out.println(dog);
        System.out.println(cat);
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
