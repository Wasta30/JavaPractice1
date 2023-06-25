package day45_Interface_AbstractionReview.ShapeTask;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    public void setSide(double side) {
        if(side<=0){

            throw new RuntimeException("Invalid Side"+side);
        }

        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }


    @Override
    public String toString() {
        return "Square{" +
                super.toString()+// call parent class toString method
                "side=" + side +
                '}';
    }
}
