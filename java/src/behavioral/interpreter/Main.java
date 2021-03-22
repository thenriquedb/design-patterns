package behavioral.interpreter;
import java.util.ArrayList;

class Main {
    public static void main(String args[]) {
        Context context = new Context("VII");

        ArrayList<Expression> tree = new ArrayList<Expression>();

        tree.add(new Thousand());
        tree.add(new Hundred());
        tree.add(new Ten());
        tree.add(new Unit());

        for (Expression exp: tree) {
            exp.interpreter(context);
        }

        System.out.println(context.getOutput());
    }
}
