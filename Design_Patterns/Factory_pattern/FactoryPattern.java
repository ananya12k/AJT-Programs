package Factory_pattern;

import java.util.*;

class Factory_pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.nextLine();
            // We don't create objects of ProductFactory
            Shape shape = ShapeFactory.createShape(n);
            shape.draw();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}