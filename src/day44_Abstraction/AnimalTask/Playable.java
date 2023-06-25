package day44_Abstraction.AnimalTask;

public interface Playable  {
    // public is only modifier for interface cuz its for 100 percent abstraction

     boolean isFriendly = true; // assign variable right away , its static and final by default
    // how to tell if some variable is static or not : any variable which declare in static block is only static , instance variable can not be declared in static block
    // remember the variable inn innterface by default are static and abstact
    void play(); // i gives public and abstract keyword in gray colour because abstract and public are given by default before java 8 abstract method is the only method for interface remember
    // innterface allow u to have multiple inheritance
    // i rempber public and abstract ffrom play();
}
