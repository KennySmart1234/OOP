package timeValidation;

import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    public void testTime() {
        try {
            new Time(77, 406, 545);
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
            new Time(7, 46, 55);
        }

    }
}
