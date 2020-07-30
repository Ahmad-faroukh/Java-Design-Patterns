package DesignPattrens.DecoratorPatternAssignment;

public abstract class ShapeDecorator implements Shape {
    public Shape styledShape;

    public ShapeDecorator(Shape s){
        this.styledShape = s;
    }

    public void draw(){
        styledShape.draw();
    }
}