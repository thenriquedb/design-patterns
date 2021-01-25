package structural.decorator;

public class Main {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt();
        TShirtStampDecorator decoratedTShirt = new TShirtStampDecorator(tShirt);

        System.out.println(tShirt.getName());
        System.out.println(tShirt.getPrice());

        System.out.println("-------------------------------------");

        System.out.println(decoratedTShirt.getName());
        System.out.println(decoratedTShirt.getPrice());
    }
}
