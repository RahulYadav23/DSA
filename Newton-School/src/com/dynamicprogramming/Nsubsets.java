package com.dynamicprogramming;

import java.util.Scanner;

public class Nsubsets {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
       System.out.print(checktarget(arr,target));
    }

    static boolean checktarget(int[]a,int target)
    {
        boolean [][] dp = new boolean[a.length+1][target+1];
        dp[0][0]=true;
        for(int i=0;i<a.length+1;i++)
            dp[i][0]=true;

        for(int i=1;i<a.length+1;i++)
        {
            for(int j=1;j<target+1;j++)
            {
                if(j-a[i-1]>=0)
                {
                    dp[i][j]=dp[i-1][j-a[i-1]]||dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[a.length][target];
    }
}
