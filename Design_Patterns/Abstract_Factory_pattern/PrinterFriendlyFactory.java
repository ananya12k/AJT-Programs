package Abstract_Factory_pattern;

public class PrinterFriendlyFactory implements AShapeFactory{

    public AShape getShape(String name) {
        if (name.equals("Circle")) {
            return new PrinterFriendlyCircle();

        } else if (name.equals("Rectangle")) {
            return new PrinterFriendlyRectangle();
        } else {

            return null;
        }
    }
    

}
