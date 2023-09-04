package Prototype_Pattern;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super();
        this.setX(x);
        this.setY(y);
        this.setColor(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    // Getters and setters for width and height
    // ...
}

