package behavioral.interpreter;

class Unit extends Expression {
    public String one() {
        return "I";
    }

    public String four() {
        return "IV";
    }

    public String five() {
        return "V";
    }

    public String nine() {
        return "IX";
    }

    public int multiplier() {
        return 1;
    }
}
