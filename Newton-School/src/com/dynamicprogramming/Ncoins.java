package com.dynamicprogramming;

import java.util.Scanner;

public class Ncoins {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(permutations(arr,target));
    }
    static int countcombination(int[] arr,int target)
    {
        int[] dp = new int[target+1];

        dp[0]=1;

        for(int i=0;i<arr.length;i++)
        {
             for(int j=1;j<target+1;j++)
             {
                 if(j-arr[i]>=0)
                 {
                     dp[j]=dp[j]+dp[j-arr[i]];
                 }
             }
        }
        return dp[target];
    }
    static int permutations(int[] arr,int target)
    {
        int[] dp = new int[target+1];

        dp[0]=1;


            for(int j=1;j<target+1;j++)
            {
                for(int i=0;i<arr.length;i++)
                {
                if(j-arr[i]>=0)
                {
                    dp[j]=dp[j]+dp[j-arr[i]];
                }
               }
             }
        return dp[target];
    }

}
