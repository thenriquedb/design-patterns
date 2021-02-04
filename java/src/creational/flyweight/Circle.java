package creational.flyweight;

public class Circle implements  Figure{
    private boolean fill;

    public Circle(boolean fill) {
        this.fill = fill;
    }

    @Override
    public void draw(String color) {
        if(fill) {
            System.out.println("circle fill");
        } else {
            System.out.println("circle not fill");
        }
    }
}
