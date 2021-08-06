package task37;

import java.util.Date;

public class TimeStampedImp implements TimeStamped{
    private final long timeStamp;

    public TimeStampedImp() {
        timeStamp = new Date().getTime();
    }

    @Override
    public long getStamp() {
        return timeStamp;
    }
}
