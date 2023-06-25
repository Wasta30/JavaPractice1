package day45_Interface_AbstractionReview.ShapeTask;

public class Circle extends Shape{

    private double radius;

    public final static double pi=3.14;// unchangeable : final
// i can set the final variable directly or i can use static block either one
    public Circle( double radius) {// i remover String name as the constructor name is already circle
        super("Circle");
        setRadius(radius);// setMethod is more reliable as i can providr condition also this.radius=radius instead of thuis i add setter
    }

    public double getRadius() {
       return radius;
    }

    public void setRadius(double radius) {
        if(radius< 0){// if radius is less than zero (negative) throw exception
            throw new RuntimeException("Invalid Radius:"+radius);
        }

        this.radius = radius;
    }


    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }


    // the easier way for toString is i cann return


    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+ // so by doing this i call the toString of parent class and there is no need to copy ftom there
                "radius=" + radius +
                '}';
    }
}
