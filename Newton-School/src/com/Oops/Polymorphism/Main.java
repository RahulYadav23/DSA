package com.Oops.Polymorphism;

public class Main {
    public static void main(String[] args)
    {
        shapes shape = new shapes();
        shapes sq = new square();
        triangle tri = new triangle();
        sq.Area();

        /*
        when the reference variable  is of super class and and object is form of child class than which method to  call
        if method is overriding , child method is called , its is called as upcasting
        parent obj = new child();

        how java determines this
        Dynamic method dispatch
         */
    }
    /*
    polymorphism doesn't apply on instance variable
    polymorphism = poly (many)+morphism(forms)
    types of polymorphism
    1. static or compile type
        method overloading is the example
        why its called as compile type which method to run is checked during the compile time


    2. runtime or dynamic (late binding)
       overriding is the example

       static methods cannot be overriding

      final , if we made method final we cannot override it(early binding)
     */
}
