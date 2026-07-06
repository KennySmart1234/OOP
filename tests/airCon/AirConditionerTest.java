package airCon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private Airconditioner kennyAc;

@BeforeEach
public void setUp(){
    kennyAc = new Airconditioner();
}


 @Test
public void testThatAC_CanBePoweredOnWhenIsOff(){

    assertTrue(kennyAc.isOn());
}

@Test
public void testThatAC_CanBePoweredOffWhenIsOn(){

    assertFalse(kennyAc.isOff());
}

@Test
public void testThatAc_CanIncreaseTo17_InTemperature(){
    assertTrue(kennyAc.isOn());
    kennyAc.increaseTemperature();
    assertEquals(17, kennyAc.getTemperature());
}

@Test
public void testThatAc_CanDcreaseTo16_InTemperature(){
    assertTrue(kennyAc.isOn());
    kennyAc.decreaseTemperature();
    assertEquals(16, kennyAc.getTemperature());
}

@Test
public void testThatAc_CanNotIncreaseAbove30InTemperature(){
    assertTrue(kennyAc.isOn());
    for(int temperatureCount = 16; temperatureCount < 30; temperatureCount++) kennyAc.increaseTemperature();
    assertEquals(30, kennyAc.getTemperature());
}

@Test
public void testThatAc_CanNotDecreaseBelow16InTemperature(){
    assertTrue(kennyAc.isOn());
    for(int temperatureCount = 16; temperatureCount < 30; temperatureCount++) kennyAc.increaseTemperature();
    assertEquals(30, kennyAc.getTemperature());
    for(int temperatureCount = 30; temperatureCount > 16; temperatureCount--) kennyAc.decreaseTemperature();
    assertEquals(16, kennyAc.getTemperature());
}

@Test
public void testThatAc_InitialStateIs16InTemperature(){
    assertTrue(kennyAc.isOn());
    kennyAc.decreaseTemperature();
    assertEquals(16, kennyAc.getTemperature());
}



}