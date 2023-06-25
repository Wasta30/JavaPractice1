package day45_Interface_AbstractionReview.ShapeTask;

public class Cube extends Shape implements Volume{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            throw new RuntimeException("Invalid Side"+side);
        }
     setSide(side);
    }

    public Cube( double side) {
        super("Cube");
        this.side = side;
    }

    @Override
    public double area() {
        return side*side*6;
    }

    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public String toString() {
        return "Cube{" +
                super.toString()+
                "side=" + side +
                '}';
    }

    @Override
    public void volume() {

    }
}
