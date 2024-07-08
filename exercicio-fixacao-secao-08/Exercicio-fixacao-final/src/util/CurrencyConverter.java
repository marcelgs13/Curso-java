package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double conversorReal (double dollarPrice, double dollarBuy) {
        double result = dollarBuy * dollarPrice * IOF ;
        return dollarBuy * dollarPrice + result; 
    }
    
}
