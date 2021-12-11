package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator {

    public Shape shape;

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    private void setRedBorder() {
        System.out.println(" of red border");
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }
}
