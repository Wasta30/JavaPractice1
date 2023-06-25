package day43_Abstraction.CarTask;

public  abstract class Car {

  private final String brand, model;
  private String color;

  private final int year;

  private double price;

  public Car(String brand, String model, String color, int year, double price) {
    this.brand = brand;
    this.model = model;
    setColor(color);

    if(year< 1886){
      throw new RuntimeException("Invalid year:"+year);
    }

    this.year = year;
    setPrice(price);

  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if(price<=0){
      throw new RuntimeException("Invalod price:"+price);
    }
    this.price = price;
  }


  // method without body ( in abstraction) , the detail is given while implementation in sub classes
  // we can make method without body but we have to use the word abstraction in method and abstract method can only be formed in abstract class or interface

  public abstract void start();

  // method with body can also be created in asbtracted class

  public void stop(){
    System.out.println("Press the brake");
  }


  @Override
  public String toString() {
    return "Car{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", year=" + year +
            ", price=" + price +
            '}';
  }
}
