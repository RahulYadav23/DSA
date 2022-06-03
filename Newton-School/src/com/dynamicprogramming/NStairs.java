package com.dynamicprogramming;

import java.util.Scanner;

public class NStairs {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        System.out.print(nstairs(n,dp));

    }
    //top-down approch
    static int nstairs(int n,int[] dp)
    {

        if(n<0)
        return 0;
        if(n==0)
            return 1;

        if(dp[n]>0)
            return dp[n];

        int x = nstairs(n-1,dp);
        int y =nstairs(n-2,dp);
        int z =  nstairs(n-3,dp);

        dp[n]=x+y+z;
        return dp[n];

    }
    //bottom up approch
    /*
    dp[0]=1;
    for(int i=1;i<n+1;i++)
    {
    if(i==1)
    dp[i]=dp[i-1];
    else if(i==2)
    d[i]=dp[i-2]+dp[i-1];
    else
    dp[i]=d[i-1]+dp[i-2]+dp[i-3];



    }
     */
}
