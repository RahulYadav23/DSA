package com.Oops.AccessMod2;

import com.Oops.AccessModifires.A;

public class B extends A {
    public static void main(String[] args) {
      A obj = new A();
      //obj.num can't access num by creating A object
        B obj2 = new B();
        obj2.num = 10; //able to access through its sub class
    }

}
