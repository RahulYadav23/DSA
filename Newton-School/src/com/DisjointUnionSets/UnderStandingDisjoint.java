package com.DisjointUnionSets;
import java.util.*;
public class UnderStandingDisjoint {

    static int[] parent;

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nodes");
        int n = sc.nextInt();
        parent = new int[n];
        for(int i=0;i<n;i++)
        {
            makeNode(i);
        }


    }

    static void makeNode(int node)
    {
        parent[node]=node;
    }






}
