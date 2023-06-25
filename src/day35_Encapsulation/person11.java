package day35_Encapsulation;

public class person11 {

    public String namee;
    public  int age ;
    public char gender;
    public String langauge;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberofHead;


    public person11(String namee, int age, char gender, String langauge) {
        this.namee = namee;
        this.age = age;
        this.gender = gender;
        this.langauge = langauge;
    }



    static{

        planet = "Earth";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberofHead=1;

    }

    // static method
    public static void printPlanetName(){
        System.out.println("Planet name is"+planet);
    }






}



/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()

 */