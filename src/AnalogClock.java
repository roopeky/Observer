import java.util.Observable;
import java.util.Observer;

class AnalogClock implements Observer {
    private ClockTimer timer;

    public AnalogClock(ClockTimer timer) {
        this.timer = timer;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("AnalogClock: " + String.format("%02d", timer.getHour()) + ":" +
                String.format("%02d", timer.getMinute()) + ":" + String.format("%02d", timer.getSecond()) + "\n");
    }
}
