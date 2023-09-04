package Prototype_Pattern;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super();
        this.setX(x);
        this.setY(y);
        this.setColor(color);
        this.radius = radius;
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    // Getters and setters for radius
    // ...
}

