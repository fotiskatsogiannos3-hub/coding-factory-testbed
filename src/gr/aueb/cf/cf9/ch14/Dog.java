package gr.aueb.cf.cf9.ch14;

/**
 * Represents a dog, a concrete subtype of {@link Animal}.
 */
public class Dog extends Animal {
    public Dog() {

    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("I am a dog");
    }

    @Override
    public String toString() {
        return "Dog{name = " + name + ", age = " + age + "}";
    }
}
