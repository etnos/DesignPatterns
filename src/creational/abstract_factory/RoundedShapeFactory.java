package creational.abstract_factory;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) return null;

        switch (shapeType.toLowerCase()) {
            case "rectangle":
                return new RoundedRectangle();
            case "square":
                return new RoundedSquare();
        }

        return null;
    }
}
