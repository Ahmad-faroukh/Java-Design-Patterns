package DesignPattrens.ProtoTypeAssignment;

import java.util.Hashtable;

public class ShapeCache {

    //hash map for shape id and object
    private static Hashtable<String, Shape> Shapes = new Hashtable<String, Shape>();

    // returns a shape clone
    public static Shape getShape(String shapeId) {
        Shape s = Shapes.get(shapeId);
        return (Shape) s.clone();
    }

    // loads the shape id and the shape clone in the hash map
    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        Shapes.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("2");
        Shapes.put(square.getId(),square);

        Triangle triangle = new Triangle();
        triangle.setId("3");
        Shapes.put(triangle.getId(),triangle);
    }

    // static methods that returns how many shapes are in the hash map
    public static int getShapeCount() {
        return Shapes.size();
    }

}