package autoBike;

public class AutomaticBike {
    private boolean bikeStatus;
    private int bikeSpeed;



    public boolean turnedOn() {
        bikeStatus = true;
        return bikeStatus;
    }

    public boolean turnedOff() {
        bikeStatus = false;
        return bikeStatus;
    }

    public int getSpeed(){
        return bikeSpeed;
    }

    public void speedIncrement(int bikeGear, int currentSpeed) {
        //boolean currentSpeed = (bikeSpeed == 15);
        if (bikeGear == 1) {
            if (currentSpeed == 0 || currentSpeed <= 19) {
                bikeSpeed = currentSpeed + bikeGear;
            }
        }
        else if (bikeGear == 2) {
            if (currentSpeed == 20 || currentSpeed <= 28) {
                bikeSpeed = currentSpeed + bikeGear;
            }
        }
        else if (bikeGear == 3) {
            if (currentSpeed == 30 || currentSpeed <= 37) {
                bikeSpeed = currentSpeed + bikeGear;
            }
        }
        else if (bikeGear == 4) {
            if (currentSpeed >= 40) {
                bikeSpeed = currentSpeed + bikeGear;
            }
        }

    }

    public void speedDecrement(int bikeGear, int currentSpeed) {

        if (bikeGear == 1) {
            if (currentSpeed == 1 || currentSpeed <= 20) {
                bikeSpeed = currentSpeed - bikeGear;
            }
        }

        else if (bikeGear == 2) {
            if(currentSpeed == 22 || currentSpeed <= 30 ) {
                bikeSpeed = currentSpeed - bikeGear;
            }
        }

        else if (bikeGear == 3) {
            if (currentSpeed == 33 || currentSpeed <= 40) {
                bikeSpeed = currentSpeed - bikeGear;
            }
        }
        else if (bikeGear == 4) {
            if (currentSpeed >= 40) {
                bikeSpeed = currentSpeed - bikeGear;
            }
        }
    }
}