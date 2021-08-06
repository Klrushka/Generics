package task37;

import java.util.Random;

public class Mixin extends BasicImp implements TimeStamped, SerialNumbered {
    private TimeStamped timeStamp = new TimeStampedImp();
    private SerialNumbered serialNumber =
            new SerialNumberedImp();
    private Colored colored = new ColoredImp(new Random().nextBoolean());

    public long getStamp() {
        return timeStamp.getStamp();
    }

    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }

    public boolean getColored(){
        return colored.getColored();
    }
}
