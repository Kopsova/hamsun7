import java.util.ArrayList;

public class OddAvg {
    public static void main(String[] args) {
        // Create a function called `oddAverage` that takes a list of numbers as parameter
        // and returns the average value of the odd numbers in the list
        // Create basic unit tests for it with at least 3 different test cases}
        int [] numbers = {1,2,3,4,5,6,7};
        System.out.println(oddAverage(numbers));
    }
        public static double oddAverage (int [] listOfNumbers){
        int sumOdds = 0;
        int numberOfOdds= 0;
        double average = 0;
            for (int i = 0; i < listOfNumbers.length; i++) {
                if ( listOfNumbers[i] %2 != 0){
                    sumOdds += listOfNumbers[i];
                    numberOfOdds ++;
                }
            }
            if ( numberOfOdds > 0) {
                average = sumOdds / numberOfOdds;
            }
            return average;
    }
}


