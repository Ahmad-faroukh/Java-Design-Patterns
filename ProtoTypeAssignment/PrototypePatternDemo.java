package DesignPattrens.ProtoTypeAssignment;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        for (int i = 1; i <= ShapeCache.getShapeCount(); i++) {
            Shape shapeClone = ShapeCache.getShape(String.valueOf(i));
            System.out.println(shapeClone.getType());
        }

    }
}