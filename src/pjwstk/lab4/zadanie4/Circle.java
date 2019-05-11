/*
    Zadanie 4
    Autor: Rafał Tęcza & Damian Brzoskowski
    Index: s19468 & s18499
*/

package pjwstk.lab4.zadanie4;

public class Circle extends Shape {
    
    private double radius = 1.0;

    public Circle()
    {

    }

    public Circle(
            String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString()
    {
        return "Filled: " + isFilled() + ", Color: " + getColor() + ", Radius: " + getRadius();
    }

    public static void main(String[] args)
    {
        Circle CircleObj = new Circle();
        System.out.println(CircleObj.toString());
        CircleObj.setRadius(2);
        CircleObj.setColor("blue");
        CircleObj.setFilled(false);
        CircleObj.getArea();
        CircleObj.getPerimeter();
        System.out.println(CircleObj.toString());
    }
}