package task21;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture<T> {
    Class<T> kind;
    private Map<String, Class<?>> classMap;


    public void addType(String typeName, Class<?> kind) {
        if (classMap.containsKey(typeName)){
            System.out.println("Change your key please");
        }
        else classMap.put(typeName, kind);
    }

    public Object createNew(String typeName) throws InstantiationException, IllegalAccessException {
        if (classMap.containsKey(typeName)) {
            return classMap.get(typeName).newInstance();
        } else {
            System.out.println("Not a valid Key");
            return null;
        }
    }

    public ClassTypeCapture(Class<T> kind, Map<String,Class<?>> map) {
        this.kind = kind;
        classMap = map;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public Map<String, Class<?>> getClassMap() {
        return classMap;
    }
}
