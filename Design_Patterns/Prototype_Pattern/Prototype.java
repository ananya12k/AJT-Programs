package Prototype_Pattern;
public class Prototype {
    public static void main(String[] args) {
        // Create prototype shapes
        Circle circlePrototype = new Circle(0, 0, "Red", 10);
        Rectangle rectanglePrototype = new Rectangle(0, 0, "Blue", 20, 15);

        // Clone and customize new shapes
        Circle clonedCircle = (Circle) circlePrototype.clone();
        clonedCircle.setX(5);
        clonedCircle.setY(5);

        Rectangle clonedRectangle = (Rectangle) rectanglePrototype.clone();
        clonedRectangle.setX(10);
        clonedRectangle.setY(10);

        // Print information about the shapes
        System.out.println("Original Circle: " + circlePrototype);
        System.out.println("Cloned Circle: " + clonedCircle);

        System.out.println("Original Rectangle: " + rectanglePrototype);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
}
