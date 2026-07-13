package timeValidation;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.validateHour(hour);
        this.validateMinute(minute);
        this.validateSecond(second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void validateHour(int hour) {
        if (hour > 23 || hour < 0) {
            throw new IllegalArgumentException("Hour is not correct");
        }
    }

    public void validateMinute(int minute) {
        if (minute > 59 || minute < 0) {
            throw new IllegalArgumentException("minute is not correct");
        }
    }

    public void validateSecond(int second) {
        if (second > 59 || second < 0) {
            throw new IllegalArgumentException("minute is not correct");
        }
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }
}
