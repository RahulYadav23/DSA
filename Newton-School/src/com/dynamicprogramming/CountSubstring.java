package com.dynamicprogramming;

import java.util.Scanner;

public class CountSubstring {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();

    }

    static int countpalindrome(String s)
    {
        int count = 0;
        int dp[][] =  new int[s.length()][s.length()];
        for(int gap=0;gap<s.length();gap++)
        {
            for(int i=0,j=gap;j<s.length();j++)
            {
                
            }
        }
        return count;
    }
}
