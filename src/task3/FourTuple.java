package task3;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    public final D dObject;

    public FourTuple(A aObject, B bObject, C cObject, D dObject){
        super(aObject, bObject, cObject);

        this.dObject = dObject;
    }
}
