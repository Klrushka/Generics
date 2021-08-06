package task40;

public class Dog extends Pet {
    @Override
    public void speak() {
        System.out.println("Dog.speak()");
    }

    @Override
    public void seat() {
        System.out.println("Dog.seat()");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat()");
    }
}
