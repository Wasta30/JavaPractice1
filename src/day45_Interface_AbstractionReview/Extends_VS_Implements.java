package day45_Interface_AbstractionReview;


// abstracte mehtod is meant to be over ridden
// i can create as many file as i  want but there can only be one public class or interface and the rest will be default class or interface
// i can give as many default interface or default class in one file but thwere is one public class / interface
// and the rule is that the one whihc has public matches with the name of the file
// and for ex interface x ,y z is for only this file because  they are not public if u want to access them make a separte file for each


class A{

}


class B{
}

class D{

}


 //one class can not extends more than one class , multiple inheritance not allowed when u use class
// but

interface Z{

}
interface X{

}


interface Y extends X , Z{// so interface allow multiple inheritance
    // interface can only extend interface but can not extend a class
}


// when to use implement keyword ?
/*
the only time u use implemnt when class inherit from interface
how to use exten and implement at same time

 */

public class Extends_VS_Implements extends A implements X,Y,Z{

}
