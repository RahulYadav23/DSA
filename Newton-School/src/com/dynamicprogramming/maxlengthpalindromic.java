package com.dynamicprogramming;

import java.util.Scanner;

public class maxlengthpalindromic {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(max(s));
    }
    static int max(String s)
    {
        int max = 0;

        boolean dp[][] =  new boolean[s.length()][s.length()];
        for(int gap=0;gap<s.length();gap++)
        {
            for(int i=0,j=gap;j<s.length();i++,j++)
            {
                if(gap==0)
                {
                    dp[i][j]=true;
                }
                else if(gap==1)
                {
                    if(s.charAt(i)==s.charAt(j))
                        dp[i][j]=true;
                }
                else
                {
                    if((s.charAt(i)==s.charAt(j))&&dp[i+1][j-1])
                        dp[i][j]=true;
                }


                if((max<(j-i))&&dp[i][j])
                {
                    max = j-i;
                }
            }
        }
        return max+1;
    }
}
