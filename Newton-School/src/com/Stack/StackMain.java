package com.Stack;

import java.util.Stack;

public class StackMain {
       public static void main(String[] args)
       {
           CustomStack<Integer> st = new CustomStack<>();
           st.Push(5);
           st.Push(6);
           st.Pop();
           st.Pop();
           st.Pop();

       }
       static int[] nextgreatestelement(int[] a)
       {
           int[] res =new int[a.length];
           Stack<Integer> st = new Stack<>();
           st.push(0);
           int index =1;
           while(index<a.length) {
               while (!st.empty() && a[st.peek()] < a[index]) {
                 res[st.pop()]=a[index];
               }
               st.push(index);
               index++;
           }
           while (!st.empty())
           {
               res[st.pop()]=-1;
           }
           return res;
       }

       static int[] nextsmallestelement(int a[])
       {
           int []res = new int[a.length];
           Stack<Integer>st = new Stack<>();
           st.push(0);
           int index = 1;
           while(index<a.length)
           {
               while (!st.empty()&&a[st.peek()]>a[index])
                   res[st.pop()]=a[index];

               st.push(index);
               index++;

           }
           while (!st.empty())
           {
               res[st.pop()]=-1;
           }

           return res;
       }
      static int[] previousgreatest(int a[])
      {
          int []res = new int[a.length];
          Stack<Integer>st = new Stack<>();
          st.push(a.length-1);
          int index = a.length-2;
          while(index>=0)
          {
              while (!st.empty()&&a[st.peek()]<a[index])
              {
                  res[st.pop()]=a[index];
              }
              st.push(index);
              index--;
          }
          while (!st.empty())
          {
              res[st.pop()]=-1;
          }

          return res;

      }
}
