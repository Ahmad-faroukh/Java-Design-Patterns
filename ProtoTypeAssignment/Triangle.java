package DesignPattrens.ProtoTypeAssignment;

public class Triangle extends Shape {

    public Triangle() {
        type = "Triangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Triangle ...");
    }
}
