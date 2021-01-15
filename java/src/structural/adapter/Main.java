package structural.adapter;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.println(currencyConverter.dollarToReal(5));
        System.out.println(currencyConverter.libraToReal(5));
        System.out.println(currencyConverter.euroToReal(5));
    }
}
