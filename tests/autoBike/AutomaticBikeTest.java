package autoBike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    private AutomaticBike bike;

@BeforeEach
public void setUp(){
        bike = new AutomaticBike();
        assertTrue(bike.turnedOn());
    }

@Test
public void testThatICanTurnOnTheBike(){

    assertTrue(bike.turnedOn());
}

@Test
public void testThatICanTurnOffTheBike(){

    assertFalse(bike.turnedOff());
}

@Test
public void testThatBikeIsAtGearOne_BikeAccelerateInIncrementOfOne_IfBikeCurrentSpeedIs15_NewBikeSpeedAfterAccelerationIs16(){

    int bikeGear = 1;
    int currentSpeed = 15;
    //for(int speedCount = 0; speedCount < 20; speedCount++)
    bike.speedIncrement(bikeGear, currentSpeed);
    assertEquals(16, bike.getSpeed());
}

@Test
public void testThatBikeIsAtGearTwo_BikeAccelerateInIncrementOfTwo_IfBikeCurrentSpeedIs24_NewBikeSpeedAfterAccelerationIs26(){

    int bikeGear = 2;
    int currentSpeed = 24;
    bike.speedIncrement(bikeGear, currentSpeed);
    assertEquals(26, bike.getSpeed());
}

@Test
public void testThatBikeIsAtGearThree_BikeAccelerateInIncrementOfThree_IfBikeCurrentSpeedIs35_NewBikeSpeedAfterAccelerationIs38(){

    int bikeGear = 3;
    int currentSpeed = 35;
    bike.speedIncrement(bikeGear, currentSpeed);
    assertEquals(38, bike.getSpeed());
}


@Test
public void testThatBikeIsAtGearFour_BikeAccelerateInIncrementOfFour_IfBikeCurrentSpeedIs44_NewBikeSpeedAfterAccelerationIs48(){

    int bikeGear = 4;
    int currentSpeed = 44;
    bike.speedIncrement(bikeGear, currentSpeed);
    assertEquals(48, bike.getSpeed());
}


@Test
public void testThatBikeIsAtGearOne_BikeDecelerateInDecrementOfOne_IfBikeCurrentSpeedIs15_NewBikeSpeedAfterDecelerationIs14(){

    int bikeGear = 1;
    int currentSpeed = 15;
    bike.speedDecrement(bikeGear, currentSpeed);
    assertEquals(14, bike.getSpeed());
}

    @Test
    public void testThatBikeIsAtGearTwo_BikeDecelerateInDecrementOfTwo_IfBikeCurrentSpeedIs24_NewBikeSpeedAfterDecelerationIs22(){

        int bikeGear = 2;
        int currentSpeed = 24;
        bike.speedDecrement(bikeGear, currentSpeed);
        assertEquals(22, bike.getSpeed());
    }


    @Test
    public void testThatBikeIsAtGearThree_BikeDecelerateInDecrementOfThree_IfBikeCurrentSpeedIs35_NewBikeSpeedAfterDecelerationIs32(){

        int bikeGear = 3;
        int currentSpeed = 35;
        bike.speedDecrement(bikeGear, currentSpeed);
        assertEquals(32, bike.getSpeed());
    }


    @Test
    public void testThatBikeIsAtGearFour_BikeDecelerateInDecrementOfFour_IfBikeCurrentSpeedIs48_NewBikeSpeedAfterDecelerationIs44(){

        int bikeGear = 4;
        int currentSpeed = 48;
        bike.speedDecrement(bikeGear, currentSpeed);
        assertEquals(44, bike.getSpeed());
    }


}