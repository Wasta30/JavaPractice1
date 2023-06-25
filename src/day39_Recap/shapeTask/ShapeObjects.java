package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {


        Square square = new Square( 10);

        square.setSide(2.5);
        System.out.println(square);
        System.out.println("----------------");
        Rectangle rectangle = new Rectangle(4.5,5.6);
        System.out.println(rectangle);
        System.out.println(rectangle.getName());// name of rectangle , can access directly use get method

        rectangle.setWidth(6);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle);

        System.out.println("------------------");
        Circle circle = new Circle(6.7);
        System.out.println(circle);
        System.out.println(circle.getName());


    }



}
