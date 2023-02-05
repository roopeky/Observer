public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        AnalogClock analogClock = new AnalogClock(timer);
        DigitalClock digitalClock = new DigitalClock(timer);

        timer.setHour(12);
        timer.setMinute(01);
        timer.setSecond(01);
    }
}