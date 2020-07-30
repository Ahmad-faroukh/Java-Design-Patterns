package DesignPattrens.DecoratorPatternAssignment;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape s) {
        super(s);
    }

    @Override
    public void draw() {
        styledShape.draw();
        setRedBorder(styledShape);
    }

    private void setRedBorder(Shape styledShape){
        System.out.println("Style : Red Border");
    }
}