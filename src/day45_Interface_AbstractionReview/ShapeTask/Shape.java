package day45_Interface_AbstractionReview.ShapeTask;

public  abstract class Shape {// parents class just have to provide method the implementation can be done in child class
     private final String name;
     // how can i sure that name of that specific shape wiill same for ex in case of circle it will be circle
/// when ever the variable is final its need to be intialized right away
    // and the best way to intizlied the variable is to make the constructor


    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

public abstract double area(); // i have to make it abstract

    public abstract double perimeter();


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
