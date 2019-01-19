package creational.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("Circle");
        s1.draw();

        Shape s2 = factory.getShape("Rectangle");
        s2.draw();

        Shape s3 = factory.getShape("Square");
        s3.draw();
    }
}
