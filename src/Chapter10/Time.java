package Chapter10;
import java.util.concurrent.TimeUnit;

public class Time { //question 1

    int hours;
    int minutes;
    int seconds;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long milliseconds) {
        int hours = (int) ((milliseconds / 3600000) % 24);
        int minutes = (int) ((milliseconds / 60000) % 60);
        int seconds = (int) ((milliseconds / 1000) % 60);

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("%s:%s:%s", this.hours, this.minutes, this.seconds);
    }

    public void setTime(long milliseconds) {
        int hours = (int) ((milliseconds / 3600000) % 24);
        int minutes = (int) ((milliseconds / 60000) % 60);
        int seconds = (int) ((milliseconds / 1000) % 60);

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public static void main(String[] args) {
        Time t1 = new Time(555550000);

        System.out.println(t1.toString());
    }
}
