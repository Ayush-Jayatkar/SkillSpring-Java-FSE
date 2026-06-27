public class Main {
    public static void main(String[] args) {

        double currentValue = 10000.0;  // starting amount
        double growthRate = 0.08;       // 8% annual growth
        int years = 5;

        
        System.out.println("Initial Value: Rs." + currentValue);
        System.out.println("Annual Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Forecast Period: " + years + " years");
        System.out.println();

        for (int i = 1; i <= years; i++) {
            double futureValue = FinancialForecast.calculateFutureValue(
                                     currentValue, growthRate, i);
            System.out.printf("Year %d: Rs.%.2f%n", i, futureValue);
        }

        System.out.println();
        System.out.println("Final Value after " + years + " years: Rs." +
            String.format("%.2f", 
                FinancialForecast.calculateFutureValue(
                    currentValue, growthRate, years)));
    }
}