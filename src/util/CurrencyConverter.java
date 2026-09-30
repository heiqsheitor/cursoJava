package util;

public class CurrencyConverter {
	
	public double dollarPrice;
	public double dollarBought;
	public static final double tax = 0.06;
	
	public  double dollarsPriceInReal() {
		return (dollarBought * dollarPrice) * (1.0 + tax);
	}
	

}
