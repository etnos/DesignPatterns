package creational.factory;

public class ShapeFactory {

    public Shape getShape(String type) {
        if (type == null) return null;

        switch (type.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
        }

        return null;
    }
}
