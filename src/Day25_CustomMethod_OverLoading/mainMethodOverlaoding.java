package Day25_CustomMethod_OverLoading;

public class mainMethodOverlaoding {
// its overlaoded but executed the first one

    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(int[] args) {
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("Double");
    }

    public static void main(char[] args) {
        System.out.println("Char");
    }

}
