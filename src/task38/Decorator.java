package task38;

public class Decorator extends Coffee {
    protected Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void setKind(String kind) {
        super.setKind(kind);
    }

    @Override
    public String getKind() {
        return super.getKind();
    }
}
