package behavioral.interpreter;

abstract class Expression {
    public void interpreter(Context context) {
        if (context.getInput().length() == 0) {
            return;
        }

        if (context.getInput().startsWith(this.nine())) {
            context.setOutput(context.getOutput() + (9 * this.multiplier()));
            context.setInput(context.getInput().substring(2));

        } else if (context.getInput().startsWith(this.four())) {
            context.setOutput(context.getOutput() + (4 * this.multiplier()));
            context.setInput(context.getInput().substring(2));

        } else if (context.getInput().startsWith(this.five())) {
            context.setOutput(context.getOutput() + (5 * this.multiplier()));
            context.setInput(context.getInput().substring(1));
        }

        while (context.getInput().startsWith(this.one())) {
            context.setOutput(context.getOutput() + (1 * this.multiplier()));
            context.setInput(context.getInput().substring(1));
        }
    }

    public abstract String one();

    public abstract String four();

    public abstract String five();

    public abstract String nine();

    public abstract int multiplier();
}
