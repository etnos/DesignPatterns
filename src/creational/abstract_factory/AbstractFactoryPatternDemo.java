package creational.abstract_factory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);

        Shape s1 = abstractFactory.getShape("rectangle");
        s1.draw();

        Shape s2 = abstractFactory.getShape("square");
        s2.draw();


        AbstractFactory abstractFactory1 = FactoryProducer.getFactory(true);

        Shape s3 = abstractFactory1.getShape("rectangle");
        s3.draw();

        Shape s4 = abstractFactory1.getShape("square");
        s4.draw();
    }
}
