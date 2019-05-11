/*
    Zadanie 4
    Autor: Rafał Tęcza & Damian Brzoskowski
    Index: s19468 & s18499
*/

package pjwstk.lab4.zadanie4;

public class Shape {

    private String color = "red";
    private boolean filled = true;

    public Shape() {}

    public Shape(
            String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString()
    {
        return "Filled: " + this.filled + ", Color: " + this.color;
    }

    public static void main(String[] args)
    {
        Shape ShapeDObj = new Shape();
        System.out.println(ShapeDObj.toString());
        System.out.println("Zmiana wartosci dla Filled i Color:");
        ShapeDObj.setColor("black");
        ShapeDObj.setFilled(false);
        System.out.println(ShapeDObj.toString());
    }
}
