import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("DigitalClock: " + String.format("%02d", timer.getHour()) + ":" +
                String.format("%02d", timer.getMinute()) + ":" + String.format("%02d", timer.getSecond()));
    }
}
