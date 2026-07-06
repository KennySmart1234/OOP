package airCon;

public class Airconditioner {

    private boolean acStatus;
    private int temperature;

    public Airconditioner(){
        this.temperature = 16;
    }

    public boolean isOn() {
        acStatus = true;
        return acStatus;
    }

    public boolean isOff() {
        acStatus = false;
        return acStatus;

    }

    public int getTemperature(){
        return temperature;
    }

    public void increaseTemperature(){
        boolean temperatureRange = (temperature < 30);
        if (temperatureRange && acStatus) {
            temperature = temperature + 1;
        }
    }

    public void decreaseTemperature() {
        boolean temperatureRange = (temperature > 16);
        if (temperatureRange && acStatus) {
            temperature = temperature - 1;
        }
    }

}