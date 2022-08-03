package com.Oops.OverRidingAndOverLoading;
/*
  method overriding should only happen between a super and sub classes
  method in both class should be having same signature and return type
  the inside logic can be differ


 */
class baseclass{
    baseclass(){

    }
    public void print(int x)
    {
        System.out.println("base class method "+(x*x));
    }

}
class derivedclass extends baseclass
{
    derivedclass()
    {

    }

    @Override
    public void print(int x) {
        System.out.println("derived class "+Math.sqrt(x));
        //super.print(x);
    }
}
public class Overriding {
   public static void main(String[] args){
       derivedclass obj = new derivedclass();
       obj.print(25);
   }
}
