package Abstract_Factory_pattern;

import java.util.*;

class Abstract_Factory_pattern {
    /*
     * Note that there's no need to create a Printer Friendly Shape or Display
     * Friendly Shape.
     * They only act as marker Interfaces
     * Reason is draw() method is what we expect to stay
     * the same. For the most part,
     * all the shapes have one task,
     * that's to draw so that remains same 
     * for all DisplayFriendly and PrinterFriendly shapes.
     * So, we don’t expect this code to change,
     * just the new style of shapes are created.
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String shape = sc.nextLine();
            AShape myShape = null;
            if (shape.equals("DisplayFriendly")) {
                shape = sc.nextLine();
                myShape = new DisplayFriendlyFactory().getShape(shape);
            } else if (shape.equals("PrinterFriendly")) {
                shape = sc.nextLine();
                myShape = new PrinterFriendlyFactory().getShape(shape);
            }
            myShape.draw();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
