package gr.aueb.cf.cf9.ch14;

/**
 * Represents a cat, a concrete subtype of {@link Animal}.
 */
public class Cat extends Animal {
    public Cat() {

    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }

    @Override
    public String toString() {
        return "Cat{name = " + name + ", age = " + age + "}";
    }
}
