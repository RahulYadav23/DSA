package com.Oops.Inheritance;

public class Student extends Person{
    int rollno;
    String name="Rahul Student";
    Student()
    {
        System.out.println("Student");
    }
    Student(int rollno)
    {

        this.rollno=rollno;
    }
    void printname()
    {
        System.out.println(name);
    }
    void PrintNames()
    {
        printname(); //always refer to the class method not super class or  parent class method
        super.printname(); //super keyword always refer to the immediate parent class
        /* by use of super we can access the methods as seen above ,variables super.variable_name or constructor like super()*/
        // super.x with the help of super also we can't access private variables
        //super.y=10; static variable
    }
}
