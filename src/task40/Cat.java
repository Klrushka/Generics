package task40;

public class Cat extends Pet{
    @Override
    public void speak() {
        System.out.println("Cat.speak()");
    }

    @Override
    public void seat() {
        System.out.println("Cat.seat()");
    }

    @Override
    public void eat() {
        System.out.println("Cat.eat()");
    }
}
