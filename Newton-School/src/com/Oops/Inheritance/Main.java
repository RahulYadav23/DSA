package com.Oops.Inheritance;

public class Main {
    public static void main(String[] args)
    {
        //Student s1 = new Student();//order of execution of constructor

        // Human h1 = new Person(); //""it works"" but we can't access variable of  person class .what we can access is
        //total depend on the references  variable. other thing it works because Person has info about Human and its constructor
        //h1.name ="hello";

      //  Person p1 = new Human(); doesn't work as human class doesn't have information about Person class
        // we are some variables p1 which doesn't exist in human class (both class have various variables )

        //Student s1 = new Student();
       // s1.printname(); always refer to the class method not super class or  parent class

       // Student s1 = new Student();
       // s1.PrintNames(); about super


        //Student.y=10;  static variable of person class
        //Object class is inherit by directly or indirectly by all classes in java , this is only the class which doesn't
        // inherit any class , it's sit top of hierarchy
        //Object obj = new Human();
        //Object obj = new Person();

        //we  made our class final we can stop inheritance ,if class is final than implcit its method are final to.

    }
}
