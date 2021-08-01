package task3;

public class SixTuple <A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E>{
    public final F fObject;

    public SixTuple(A aObject, B bObject, C cObjet, D dObject, E eObject, F fObject){
        super(aObject, bObject, cObjet, dObject, eObject);

        this.fObject = fObject;
    }
}
