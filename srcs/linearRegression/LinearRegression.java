package linearRegression;

public class LinearRegression {

    private int[] agesX;
    private int[] weightsY;

    public LinearRegression(){
        this.agesX = new int[]{5, 6, 8, 5, 6};
        this.weightsY = new int[]{8, 8, 12, 9, 11};
    }

    public int getSumOfAges(){

        int sumOfAges = 0;

        for(int age : agesX){
            sumOfAges = sumOfAges + age;
        }
    return sumOfAges;
}


    public int getSumOfWeights() {

        int sumOfweights = 0;

        for (int weight : weightsY) {
            sumOfweights = sumOfweights + weight;
        }
        return sumOfweights;

    }

    public int getSumOfAgesTimesWeights() {

        int ageXAndWeightY = 0;

        for(int index = 0; index < agesX.length; index++){
            ageXAndWeightY +=  (agesX[index] * weightsY[index]);
        }

        return ageXAndWeightY;
    }

    public int getSumOfAllAgesSquare() {

        int ageXSquared = 0;

        for(int age : agesX){
            ageXSquared += (int) Math.pow(age, 2);

        }
        return ageXSquared;
    }

    public int getSumOfAllWeightsYSquare() {

        int weightsYSquared = 0;

        for(int weight : weightsY){
            weightsYSquared += (int) Math.pow(weight, 2);

        }
        return weightsYSquared;

    }

    public double calculateBOneSlope() {

        double slopeBOne = (agesX.length * (getSumOfAgesTimesWeights()) - (getSumOfAges())*(getSumOfWeights())) /
                                      (agesX.length * (getSumOfAllAgesSquare()) - (Math.pow(getSumOfAges(), 2)));

        double result = Double.parseDouble(String.format("%.4f", slopeBOne));

        return result;
    }

    public double calculateBZeroIntercept() {
        double interceptBZero = (getSumOfWeights() - (calculateBOneSlope() * getSumOfAges())) / agesX.length;

        double result = Double.parseDouble(String.format("%.4f", interceptBZero));

        return result;
    }

    public String getLinearRegressionResult() {

        String finalResult = String.format("%.4fX + %.4f", calculateBOneSlope(), calculateBZeroIntercept());
//        String finalResult = String.valueOf(result);

        return finalResult;
    }
}
