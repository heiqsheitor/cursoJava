package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;
import util.CurrencyConverter;

public class Program2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		Calculator calc = new Calculator(); // instanciar esse objeto pois os membros do Calculator não são estáticos.
		
		CurrencyConverter cC = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		cC.dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		cC.dollarBought = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = " + cC.dollarsPriceInReal());
		
		
		sc.close();
	}
}