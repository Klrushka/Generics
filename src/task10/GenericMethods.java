package task10;

public class GenericMethods {
    public <A, B> void f(A a, B b, String c) {
        System.out.println(a.getClass().getSimpleName() + "\n" +
                b.getClass().getSimpleName() + "\n" +
                c.getClass().getSimpleName());
    }

}
