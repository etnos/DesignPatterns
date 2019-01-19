package creational.abstract_factory;

public class ShapeFactoy extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        switch (shapeType.toLowerCase()) {
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();

        }
        return null;
    }
}
