package task3;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
    public final E eObject;

    public FiveTuple(A aObject, B bObject, C cObjet, D dObject, E eObject) {
        super(aObject, bObject, cObjet, dObject);

        this.eObject = eObject;
    }
}
