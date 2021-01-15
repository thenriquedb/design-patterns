package structural.adapter;

// Adapte
public class CurrencyExchanges {
    private double dollar = 5.25;
    private double euro = 6.36;
    private double libra = 7.15;

    //  get current currency on API

    protected double getDollar() {
        return dollar;
    }

    protected double getEuro() {
        return euro;
    }

    protected double getLibra() {
        return libra;
    }
}
