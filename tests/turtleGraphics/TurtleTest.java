package turtleGraphics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurtleTest {
    @Test
    public void testThatTurtlePositionStartsAtZero() {
        TurtlePosition position = new TurtlePosition();

        assertEquals(0, position.getRowPosition());
        assertEquals(0, position.getColumnPosition());


    }
}
