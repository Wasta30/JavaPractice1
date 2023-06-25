package day37_Inheritance;


class A{
  public A(){
      System.out.println("A");
  }
}

class B extends A{// we did not give the super keyword here because the constructor us default
    //but we do have super keyword here automaticaly given by compiler even thou we dont see it
    // so this sublcass first call parent class constructor and print A then print B
    public B(){
        // super()
        System.out.println("B ");
    }
}


class C{
    public C(int a){// now the constrcutpr have an argument so i need to givve super keyword in sub class
        System.out.println("C");
    }
}

// the constructpr funcitnalit is intialize instance variable
class D extends C{
    public D(){// and the constrcutor call has to be the first step
        super(8);// so in order to call parent class constructor we have to give super keyword( when there is an arguement)
        System.out.println("D");
    }
}

public class ConstructorPractice {


    public static void main(String[] args) {


        B obj = new B(); // it prints A and B , so B is call parent class A construtor
    }





}
