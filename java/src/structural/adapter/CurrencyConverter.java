package structural.adapter;

//Suppose an external library is used to perform this conversion.
public class CurrencyConverter extends CurrencyExchanges {
    public double dollarToReal(double value) {
        return value / this.getDollar();
    }

    public double euroToReal(double value) {
        return value / this.getEuro();
    }

    public double libraToReal(double value) {
        return value / this.getLibra();
    }
}
