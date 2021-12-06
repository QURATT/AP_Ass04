package application;

public class InvestingMoney {
    public enum CompoundType {
        YEARLY(1), BIANNUALLY(2), QUARTERLY(4), MONTHLY(12), WEEKLY(52), DAILY(356);
        private int compounding;
        CompoundType(int compounding) { this.compounding = compounding; }
        public int getCompounding() { return compounding; }
    }

    public static double InvestmentValue(double investment, double rate, int periods, CompoundType cmp) {
        rate = 1 + (rate / 100) / cmp.getCompounding();
        periods *= cmp.getCompounding();

        // FV = PV * R^n
        return investment * Math.pow(rate, periods);
    }
}
