package gr.aueb.cf.cf9.ch14;

/**
 * Base class representing a generic animal with a name and age.
 */
public class Animal {
    protected String name;
    protected int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("I am an animal");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
