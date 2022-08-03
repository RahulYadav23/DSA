package com.dynamicprogramming;

import java.util.Scanner;

public class knapsack01 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);


        int n = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for(int i=0;i<n;i++)
        {
            weight[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            value[i]=sc.nextInt();
        }

        int capacity = sc.nextInt();
     System.out.print(knapsackunlimited(weight,value,capacity));
    }


    static int knapsack(int weight[],int[] value ,int capacity)
    {
        int[][] dp = new int[weight.length+1][capacity+1];

        for(int i=1;i<weight.length+1;i++)
        {
            for(int j=1;j<capacity+1;j++)
            {
               if(j-weight[i-1]>=0)
               {
                   dp[i][j]=Math.max(value[i-1]+dp[i-1][j-weight[i-1]],dp[i-1][j]);
               }
               else
               {
                   dp[i][j]=dp[i-1][j];
               }
            }
        }



        return dp[weight.length][capacity];
    }

    static int knapsackunlimited(int weights[],int[] value ,int capacity)
    {
        int[] dp = new int[capacity+1];
        for(int i=0;i<capacity+1;i++)
        {
            for(int j=0;j<weights.length;j++)
            {
                if(weights[j]<=i)
                {
                   dp[i]=Math.max(dp[i],value[j]+dp[i-weights[j]]);

                }
            }
        }
        return dp[capacity];
    }
}
