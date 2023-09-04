package Prototype_Pattern;

public abstract class Shape implements Cloneable {
    private int x;
    private int y;
    private String color;

    public Shape() {
        // Default constructor
    }

    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }
    public void setX(int m){
        this.x=m;
    }
    public void setY(int m){
        this.y=m;
    }
    public void setColor(String m){
        this.color=m;
    }
    public abstract Shape clone();

}

