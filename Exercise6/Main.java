package Exercise6;

public class Main {
    public static void main(String[] args) {

        TaxStrategy usaTaxStrategy = new USATaxStrategy();
        TaxCalculator usaTaxCalculator = new TaxCalculator(usaTaxStrategy);

        double taxUSA = usaTaxCalculator.calculateTax();
        System.out.println("Taxi for USA: " + taxUSA);

        TaxStrategy ukTaxStrategy = new UKTaxStrategy();
        TaxCalculator ukTaxCalculator = new TaxCalculator(ukTaxStrategy);

        double taxUK = ukTaxCalculator.calculateTax();
        System.out.println("Tax for UK: " + taxUK);
    }
}