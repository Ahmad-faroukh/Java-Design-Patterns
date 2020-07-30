package DesignPattrens.DecoratorPatternAssignment;

public class Main {
    public static void main(String[] args) {

        Shape square = new Square();
        Shape triangle = new Triangle();

        System.out.println("Square Without Style");
        square.draw();
        System.out.println("--------------------------------------");

        Shape redCircle = new RedShapeDecorator(square);
        System.out.println("Square With RedShapeDecorator");
        redCircle.draw();
        System.out.println("--------------------------------------");

        System.out.println("Triangle Without Style");
        triangle.draw();
        System.out.println("--------------------------------------");

        Shape redRectangle = new RedShapeDecorator(triangle);
        System.out.println("Triangle With RedShapeDecorator");
        redRectangle.draw();
        System.out.println("--------------------------------------");

    }
}
