package application;
 
public enum Currency {
	PKR("rupee", 1), 
    USD("dollar", 176.97),
    GBP("pound", 234.52),
    EUR("euro", 199.69),
    YEN("yen",1.56);
	
 
    private double rupeeConversionRate;
 
    private String fullName;

    Currency(String fullName, double rupeeConversionRate) {
        this.rupeeConversionRate = rupeeConversionRate;
        this.fullName = fullName;
    }

    public double getRupeeConversionRate() {
        return rupeeConversionRate;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return name();
    }

}
