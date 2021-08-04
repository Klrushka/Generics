package task33;

import java.util.ArrayList;
import java.util.List;

public class FixedSizeStack<T> {
    private List<T> storage = new ArrayList<>();
    private int iterator = 0;

    public void push(T item) {
        storage.add(item);
        iterator++;

    }

    public T pop() {
        iterator--;
        return  storage.get(iterator);
    }

    public int getSize(){
        return storage.size();
    }
}
