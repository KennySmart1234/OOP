package dSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    private Stack stringsStack;
    @BeforeEach
    public void setUp(){
        stringsStack = new Stack();
    }


    @Test
    public void testThatTheStackCreatedIsEmpty(){

        assertTrue(stringsStack.isEmpty());
    }

    @Test
    public void testThatOneElementIsAddedToTheStackCreated(){

        assertTrue(stringsStack. isEmpty());
        stringsStack.push("Toyota");
        assertFalse(stringsStack.isEmpty());

    }


    @Test
    public void testThatPush_PopIsElementIsEmptyINTheStackCreated(){

        stringsStack.push("Toyota");
        assertFalse(stringsStack.isEmpty());
        stringsStack.pop();
        assertTrue(stringsStack. isEmpty());

    }


    @Test
    public void testThatArrayOfFiveElementIsEmptyAfterPopMethod(){

        stringsStack.push("Toyota");
        stringsStack.push("Venser");
        stringsStack.push("GLE");
        stringsStack.push("Corola");
        stringsStack.push("Camry");
        assertFalse(stringsStack.isEmpty());
        stringsStack.pop();
        stringsStack.pop();
        stringsStack.pop();
        stringsStack.pop();
        stringsStack.pop();
        assertEquals(0, stringsStack.totalElement());


    }


    @Test
    public void testThatArrayCanNotHoldMoreThanFiveElementTheStackCreated(){

        stringsStack.push("Toyota");
        stringsStack.push("Venser");
        stringsStack.push("GLE");
        stringsStack.push("Corola");
        stringsStack.push("Camry");
//        stringsStack.push("Hilux");
        assertFalse(stringsStack.isEmpty());
        assertEquals(5, stringsStack.totalElement());


    }


    @Test
    public void testThatElementInArrayIsFourInTheStackCreated(){

        stringsStack.push("Toyota");
        stringsStack.pop();
        assertTrue(stringsStack. isEmpty());
        stringsStack.push("Venser");
        stringsStack.pop();
        assertTrue(stringsStack. isEmpty());
        stringsStack.push("GLE");
        stringsStack.push("Corola");
//        stringsStack.push("Camry");
        stringsStack.push("Hilux");
        assertFalse(stringsStack.isEmpty());
        assertEquals(3, stringsStack.totalElement());


    }

}
