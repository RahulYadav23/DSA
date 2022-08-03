package com.graph;

import java.util.Scanner;

public class graphrun {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices = sc.nextInt();
        graph gp = new graph(vertices);
        System.out.println("Enter the number of edges");
        int edges =sc.nextInt();
        System.out.println("Enter the source and destination of edges");
        for(int i=0;i<edges;i++)
        {
            int source = sc.nextInt();
            int destination = sc.nextInt();

            gp.addEdges(source,destination);

        }
       gp.countComponents();

    }
}
