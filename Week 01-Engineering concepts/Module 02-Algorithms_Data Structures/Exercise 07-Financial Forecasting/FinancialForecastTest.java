public class FinancialForecastTest {
    public static void main(String[] args) {
        FinancialForecast forecastTool = new FinancialForecast();

        double baseAmount = 12000.0;
        int futureYear = 2040;

        try {
            double outcome = forecastTool.predictFutureValue(futureYear, baseAmount);
            System.out.printf("Predicted value in %d for initial amount %.2f with %.2f%% growth: %.2f\n",
                    futureYear, baseAmount, forecastTool.getAnnualGrowthRate(), outcome);
        } catch (IllegalArgumentException err) {
            System.out.println("Forecast failed: " + err.getMessage());
        }
        try {
            forecastTool.updateAnnualGrowth(-20);
        } catch (IllegalArgumentException err) {
            System.out.println("Growth rate check passed: " + err.getMessage());
        }
        try {
            forecastTool.predictFutureValue(2010, baseAmount);
        } catch (IllegalArgumentException err) {
            System.out.println("Year validation check passed: " + err.getMessage());
        }

        // Invalid Negative Initial Amount
        try {
            forecastTool.predictFutureValue(futureYear, -4000);
        } catch (IllegalArgumentException err) {
            System.out.println("Initial value check passed: " + err.getMessage());
        }
    }
}
