package behavioral.interpreter;

class Thousand extends Expression {
    public String one() {
        return "M";
    }

    public String four() {
        return " ";
    }

    public String five() {
        return " ";
    }

    public String nine() {
        return " ";
    }

    public int multiplier() {
        return 1000;
    }
}
