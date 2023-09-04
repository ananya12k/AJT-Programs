package Factory_pattern;

public class ShapeFactory {
    public static Shape createShape(String name) {
        if (name == null) {
            return null;
        }
        if (name.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (name.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (name.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else {

            return null;
        }
    }

}
