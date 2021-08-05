package task34;

public class InheritedBySBC extends SelfBoundedClass<InheritedBySBC>{
    @Override
    public InheritedBySBC abstractMethod(InheritedBySBC type) {
        System.out.println("InheritedBySBC: ");
        return type;
    }
}
