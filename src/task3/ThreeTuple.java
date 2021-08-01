package task3;

import java.util.TreeMap;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C cObject;

    public ThreeTuple(A aObject, B bObject, C cObject) {
        super(aObject, bObject);

        this.cObject = cObject;

    }
}
