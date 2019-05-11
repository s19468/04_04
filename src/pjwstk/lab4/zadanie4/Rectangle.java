/*
    Zadanie 4
    Autor: Rafał Tęcza & Damian Brzoskowski
    Index: s19468 & s18499
*/

package pjwstk.lab4.zadanie4;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle()
    {

    }

    public Rectangle(String color, boolean filled, double width, double length)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length * this.width);
    }

    public String toString()
    {
        return "Filled: " + isFilled() + ", Color: " + getColor() + ", Width: " + getWidth() + ", Length: " + getLength();
    }

    public static void main(String[] args)
    {
        Rectangle RectangleObj = new Rectangle();
        System.out.println(RectangleObj.toString());
        RectangleObj.setColor("blue");
        RectangleObj.setFilled(false);
        RectangleObj.getArea();
        RectangleObj.getPerimeter();
        RectangleObj.setLength(3.2);
        RectangleObj.setWidth(4.2);
        System.out.println(RectangleObj.toString());
    }
}