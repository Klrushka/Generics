package task37;

public class ColoredImp implements Colored{
    final private boolean colored;

    public ColoredImp(Boolean colored){
        this.colored = colored;
    }

    @Override
    public boolean getColored() {
        return colored;
    }
}
