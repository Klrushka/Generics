package task34;

public abstract class SelfBoundedClass<T extends SelfBoundedClass<T>> {
    public abstract T abstractMethod(T type);

    public T nonAbstractMethod(T type){
        System.out.println("non abstract");
        return abstractMethod(type);
    }

}
