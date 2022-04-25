package com.Stack;

import java.util.ArrayList;

public class CustomStack <T>{

       private ArrayList<T> stack;

       CustomStack(){
           this.stack=new ArrayList<T>();
       }

       public void Push(T data)
       {
           this.stack.add(data);
       }
       public T Pop()
       {
           if(this.stack.size()==0) {
               System.out.println("Empty or underflow");
               return null;
           }
           return this.stack.remove(this.stack.size()-1);
       }
       public T Peek()
       {     if(this.stack.size()==0)
       {
           System.out.println("Empty");
           return null;
       }

           return this.stack.get(this.stack.size()-1);
       }
       public int Size()
       {
           return this.stack.size();
       }

}
