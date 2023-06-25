package day39_Recap.shapeTask;

public class Shape {
    // getter an setter inherited to sub classes

    // private data is accessable with in the same class

private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.err.println("Name can not be null");
            System.exit(1);// something went wrong
        }

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {
       setName(name);
    }



    public double area(){

        return 0; // we gave this because we dont have specific req as this is generic
    }



    public double perimeter(){// this can not be priavte other classes cant use it

        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                " ,area='" + area() + '\'' +
                " ,perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}

 */