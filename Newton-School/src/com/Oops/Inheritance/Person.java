package com.Oops.Inheritance;

public class Person extends Human{
    String name="Rahul Person";
    private int x;
    static  int y;
    Person(String name)
    {
        this.name=name;
    }
    Person()
    {
        System.out.println("Person");
    }
    void printname()
    {
        System.out.println(name);
    }

}
