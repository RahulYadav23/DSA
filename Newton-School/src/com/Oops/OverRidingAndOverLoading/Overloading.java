package com.Oops.OverRidingAndOverLoading;

public class Overloading {
    int a;
    int b;
    int c;
    // overloading of method or constructor : writing two or more methods or constructor with same name(int method case)
    //they only difference is method signature or type of argument or number of arguments(signature method name + parameters )(not include the method return type)
    //return type can be same or not
    //----------------- constructor overLoading
    Overloading()
    {

    }
    Overloading(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    Overloading(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    //--------------------------------------------------------


    public static void main(String[] args)
    {
        //----------------- constructor overLoading
        Overloading obj = new Overloading();
        Overloading obj1 = new Overloading(1,2,3);
        Overloading obj2 = new Overloading(1,2);
        //--------------------------------------------------------

        //----------------- methods  overLoading
        obj.sum(10,20);
        obj.sum(10,20,30);
    }


    //----------------- methods  overLoading
    public void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public int sum(int b,int c)
    {
        System.out.println(b+c);
        return b+c;
    }
    //--------------------------------------------------------
}
