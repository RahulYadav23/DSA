package com.Stringsproblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {


    public static  void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(stringcompress(str));
        System.out.println(removedublicate(str));
    }
    //https://leetcode.com/problems/rotate-string/
    //TC = n*n;
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            if(s.equals(goal))
                return true;

            s = shiftfuntion(s);
        }


        return false;
    }

    static String shiftfuntion(String s)
    {
        char[] cb = s.toCharArray();
        char c = cb[0];
        for(int i=0;i<cb.length-1;i++)
        cb[i]=cb[i+1];

        cb[cb.length-1]=c;

        String se = new String(cb);
        return se;
    }

    //with tc = O(1);
    /*public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;

        String s2= s+s;

        if(s2.contains(goal))
            return true;


        return false;
    } */
    //-------------------------------------------------
    //https://leetcode.com/problems/reverse-string/
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++)
        {
            char c = s[i];
            s[i]=s[s.length-i-1];
            s[s.length-1-i]=c;
        }
    }
//https://leetcode.com/problems/shuffle-string/submissions/
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
        for(int i=0;i<indices.length;i++)
        {
            ch[indices[i]]=(char)s.charAt(i);
        }

        s = new String(ch);
        return s;
    }
  //  https://leetcode.com/problems/backspace-string-compare/submissions/
  public boolean backspaceCompare(String s, String t) {
      return (Stringcustom(s).equals(Stringcustom(t)));

  }
    public String Stringcustom(String s){
        StringBuilder temp = new StringBuilder();
        int count = 0;
        for(int i=s.length()-1; i>=0;i--){
            if(s.charAt(i) == '#'){
                count++;
            }else if(count > 0){
                count--;
            }else{
                temp.append(s.charAt(i));
            }
        }
        return temp.toString();
    }
    //aaabbcccddeef
    //output --
    //a3b2c3d2e2f
    static String stringcompress(String str)
    {    int count=1;
          String s="";
          int i=0;
        for (i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }
            else
            {
                s = s + str.substring(i-1,i)+ Integer.toString(count);
                count=1;
            }
        }
        s  = s+str.substring(i,i+1)+Integer.toString(count);;
        return s;
    }

    ///removedublicatefromstring
    // can use a hash set.
    //without using the hashset
    static String removedublicate(String str)
    {  String s="";
        int i=0;
        HashSet<Character> set = new HashSet<>();
        for(i=0;i<str.length();i++)
        {
            if(!set.contains(str.charAt(i)))
            {
                s=s+str.substring(i,i+1);
                set.add(str.charAt(i));
            }

        }
        return s;
    }

}
