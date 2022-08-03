package com.dynamicprogramming;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
       System.out.print(fibonacci(n,dp));

    }

    static int fibonacci(int n,int dp[])
    {
        if(n==0||n==1)
        {
            return n;
        }

        if(dp[n]>0)
        {
            return dp[n];
        }

        int fib1 = fibonacci(n-1,dp);
        int fib2= fibonacci(n-2,dp);
        int fib3 = fib1+fib2;
        dp[n]=fib3;
        return fib3;
    }
    static int topfibnacci(int n)
    {
        int[] dp = new int[n+1];

        for(int i=2;i<n+1;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}
