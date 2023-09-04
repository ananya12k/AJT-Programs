package Abstract_Factory_pattern;

public class DisplayFriendlyFactory implements AShapeFactory {
    public AShape getShape(String name){
        if (name.equals("Circle")) {
            return new DisplayFriendlyCircle();
            
        } else if(name.equals("Rectangle")) {
            return new PrinterFriendlyRectangle();
        }
        else{

            return null;
        }
    }
    
}
