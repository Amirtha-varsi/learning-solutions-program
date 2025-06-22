public class FinancialForecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return predictFutureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000;  // ₹10,000
        double annualGrowthRate = 0.10;    // 10%
        int forecastYears = 5;

        double futureValue = predictFutureValue(initialInvestment, annualGrowthRate, forecastYears);

        System.out.printf("Future value after %d years: ₹%.2f\n", forecastYears, futureValue);
    }
}
