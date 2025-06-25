public class FinancialForecast {

    public static double predictFutureValue(double initialAmount, double rate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return predictFutureValue(initialAmount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initial = 10000;  
        double growthRate = 0.10; 
        int years = 5;

        double futureValue = predictFutureValue(initial, growthRate, years);
        System.out.printf("Predicted value after %d years: %.2f\n", years, futureValue);
    }
}
