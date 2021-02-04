package creational.flyweight;

import java.util.HashMap;

public class FigureFactory {
    private static final HashMap<String, Figure> figures = new HashMap<String, Figure>();

    public static Figure getFigure(String name) {
        Figure figure = figures.get(name);

        if(figure != null)  return figure;

        switch (name) {
            case "circle fill":
                figure = new Circle(true);
                break;

            case "circle not fill":
                figure = new Circle(false);
                break;

            case "line":
                figure = new Line();
                break;

            default:
                System.out.println("Invalid name");
                break;
        }

        figures.put(name,figure);

        return  figure;
    }
}