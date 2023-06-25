package day37_Inheritance.phoneTask;

public class Phone {// contain common feature for all subclasses


    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;
    public static boolean hasBattery=true; //  how to intiliaze it to ve static block
// why wwe shpuld not set static in constructor because everytime it execute it will print true
    // so the same code fragement assigned 100 times static just have one copy and same for all
    // so never ever use constructor to have execute static vaiable
// this constrcutor will nt be inherited in sub class we have to call it
    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }


    // 3 instance method

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +// add static variable here
                '}';
    }

/*static{// just runs one time
        hasBattery=true;
}*/


}
