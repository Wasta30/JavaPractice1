package day40_FinalKeyword;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class Encapsulation_Review {
// if modifier is defsault can only use in same class
    private Circle circle; // the data type is Circle

    private Square square;

    public Circle getCircle(){// the getter return type must match with data type of variable as Circle
        return circle;
    }


    public void setCircle(Circle circle){ // for setter the data type inside () must match with private variable

        if(circle.getRadius()<5){
            return;
        }
        this.circle=circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }





}
// you have to use inheritance in ur frame work otherwise we will end up creating so many cllasses