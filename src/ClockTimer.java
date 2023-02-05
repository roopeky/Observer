import java.util.Observable;

class ClockTimer extends Observable {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        setChanged();
        notifyObservers();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        setChanged();
        notifyObservers();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        setChanged();
        notifyObservers();
    }
}