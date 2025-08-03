public class FinancialForecast {

    private double annualRate = 0.05;

    public void updateAnnualGrowth(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Growth must be between 0% and 100%");
        }
        this.annualRate = percentage / 100.0;
    }

    public double getAnnualGrowthRate() {
        return annualRate * 100;
    }

    /**
     * Predicts future investment value recursively.
     */
    public double predictFutureValue(int yearGoal, double startingAmount) {
        int thisYear = java.time.Year.now().getValue();

        if (yearGoal <= thisYear) {
            throw new IllegalArgumentException("Year must be in the future.");
        }
        if (startingAmount < 0) {
            throw new IllegalArgumentException("Initial amount cannot be negative.");
        }

        int timeSpan = yearGoal - thisYear;
        return calculateRecursively(startingAmount, timeSpan);
    }

    /**
     * Core recursive function for future value calculation.
     */
    private double calculateRecursively(double amount, int remainingYears) {
        if (remainingYears == 0) {
            return amount;
        }
        return calculateRecursively(amount, remainingYears - 1) * (1 + annualRate);
    }
}
