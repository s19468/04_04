package pjwstk.lab4.zadanie4;

public class Square extends Rectangle {
    private double side;

    public Square()
    {

    }

    public Square(double side)
    {
        this.side = side;
    }

    public Square(
            double side, String color, boolean filled)
    {
        super.setColor(color);
        super.setFilled(filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public String toString()
    {
        return ("Filled: " + isFilled() + ", Color: " + getColor() +
                ", Width: " + getWidth() + ", Length: " + getLength() +
                ", Side: " + getSide()
        );
    }

    public static void main(String[] args)
    {
        Square SquareObj = new Square(3, "black", false);
        System.out.println(SquareObj.toString());
        SquareObj.setColor("blue");
        SquareObj.setFilled(true);
        SquareObj.getArea();
        SquareObj.getPerimeter();
        SquareObj.setLength(3.2);
        SquareObj.setWidth(4.2);
        SquareObj.setSide(5.3);
        System.out.println(SquareObj.toString());
    }
}