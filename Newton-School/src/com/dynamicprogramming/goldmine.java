package com.dynamicprogramming;

import java.util.Scanner;

public class goldmine {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        ans(arr);
    }
    static void ans(int[][] arr)
    {
       int[][] dp = new int[arr.length][arr.length];
        for(int col= arr.length-1;col>=0;col--)
        {
            for(int row= arr.length-1;row>=0;row--)
            {
                if(col== arr.length-1)
                {
                    dp[row][col]=arr[row][col];
                }
                else if(row== arr.length-1)
                {
                    dp[row][col]=arr[row][col]+Math.max(dp[row][col+1],dp[row-1][col+1]);
                }
                else if(row==0)
                {
                    dp[row][col]=arr[row][col]+Math.max(dp[row][col+1],dp[row+1][col+1]);
                }
                else
                {
                    dp[row][col]=arr[row][col]+Math.max(dp[row][col+1],Math.max(dp[row+1][col+1],dp[row-1][col+1]));
                }
            }
        }

    }
}
