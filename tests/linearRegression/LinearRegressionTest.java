

package linearRegression;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearRegressionTest {

    private LinearRegression calculateRegression;

    @BeforeEach
    public void setUp(){
        calculateRegression = new LinearRegression();
    }

    @Test
    public void testToCalculateTheSumOfAllAgesInAnArray(){

//        int[] agesX = {5, 6, 8, 5, 6};
        int ageSum = calculateRegression.getSumOfAges();
        assertEquals(30, ageSum);

    }

    @Test
    public void testToCalculateTheSumOfAllWeightsInAnArray(){

//        int[] weightsY = {8, 8, 12, 9, 11};
        int weightSum = calculateRegression.getSumOfWeights();
        assertEquals(48, weightSum);

    }

    @Test
    public void testToMultiplyAllAgesAndWeightsTogetherInAnArrayBasedOnEachIndex(){

//        int[] agesX    = {5, 6, 8, 5, 6};
//        int[] weightsY = {8, 8, 12, 9, 11};
        int ageXAndWeightY = calculateRegression.getSumOfAgesTimesWeights();
        assertEquals(295, ageXAndWeightY);

    }


    @Test
    public void testToCalculateSquareOfAllAgesInAnArray(){

//        int[] agesX    = {5, 6, 8, 5, 6};
        int ageXSquared = calculateRegression.getSumOfAllAgesSquare();
        assertEquals(186, ageXSquared);

    }


    @Test
    public void testToCalculateSquareOfAllWeightsInAnArray(){

//        int[] weightsY = {8, 8, 12, 9, 11};
        int weightsYSquared = calculateRegression.getSumOfAllWeightsYSquare();
        assertEquals(474, weightsYSquared);

    }


    @Test
    public void testToCalculateSlope_b1(){

        double slopeBOne = calculateRegression.calculateBOneSlope();
        assertEquals(1.1667, slopeBOne);

    }


    @Test
    public void testToCalculateSlope_b0(){

        double interceptBZero = calculateRegression.calculateBZeroIntercept();
        assertEquals(2.5998, interceptBZero);

    }


    @Test
    public void testToConfirmSlope_B1AndSlope_b0(){

        String SlopeBoneAndSlopeBZero = calculateRegression.getLinearRegressionResult();
        assertEquals("1.1667X + 2.5998", SlopeBoneAndSlopeBZero);

    }

}
