package creational.flyweight;

public class Main {
    public static void main(String[] args) {
        Figure line =  FigureFactory.getFigure("line");
        Figure circleFill =  FigureFactory.getFigure("circle fill");
        Figure circleNotFill =  FigureFactory.getFigure("circle not fill");

        line.draw("red");
        circleFill.draw("blue");
        circleNotFill.draw("green");
    }
}
