package Day32_Constructor;

public class Test {

    public Test(){// A
        System.out.println("A");
    }


    public Test(int a){// A B
        this();
        System.out.println("B");
    }

    public Test(double a){// A B C
        this(9);
        System.out.println("C");
    }

    public Test(String str) {// A B C D
        this(2.5);
        System.out.println("D");
    }


    public static void main(String[] args) {

        new Test();
        System.out.println("----");
        new Test(10);
        System.out.println("-------");
        new Test(2.5);
        System.out.println("--------");
        new Test("OK");

    }

}
