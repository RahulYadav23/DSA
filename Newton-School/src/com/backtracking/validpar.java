package com.backtracking;
 import java.util.*;
//print all valid paranthese and 5  recursion example
public class validpar {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         char[] str=new char[2*n];
       printpar(n,str,0,0,0);
     }

      static void printpar(int n,char[] s,int open,int close ,int index) {
          if (close == n) {
              for(int i=0;i<s.length;i++)
              System.out.print(s[i]);
              System.out.println();
              return;
          }
          else {

              if (open > close) {
                  s[index] = ')';
                  printpar(n, s, open, close + 1, index + 1);
              }
              if (open < n) {
                  s[index] = '(';
                  printpar(n, s, open + 1, close, index + 1);
              }
          }
      }

}


