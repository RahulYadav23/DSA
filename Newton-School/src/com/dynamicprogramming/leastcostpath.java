package com.dynamicprogramming;

import java.util.Scanner;

public class leastcostpath {
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

      System.out.print(ans(arr));
    }

    static int ans(int arr[][])
    {
        int[][]dp=new int[arr.length][arr.length];
        for(int i= arr.length-1;i>=0;i++)
        {
            for(int j=arr.length;j>=0 ;j++)
            {
              if(i== arr.length-1&&j== arr.length-1)
              {
                  dp[i][j]=arr[i][j];
              }
              else if(i== arr.length-1)
              {
                  dp[i][j]=arr[i][j]+dp[i][j+1];
              }
              else if(j== arr.length-1)
              {
                  dp[i][j]=arr[i][j]+dp[i+1][j];
              }
              else
              {
                  dp[i][j]=arr[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
              }
            }
        }

       return dp[0][0];

    }
}
