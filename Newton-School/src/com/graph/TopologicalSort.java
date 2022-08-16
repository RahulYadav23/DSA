package com.graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class TGraph {
    ArrayList<Integer>[] adj;

    TGraph(int vertices) {
        adj = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new ArrayList<>();
        }

    }

    public void addEdges(int source, int destination) {
        adj[source].add(destination);
    }

    public void topologicalSort()
    {
        boolean[] visited = new boolean[adj.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<adj.length;i++)
        {
            if(!visited[i])
            {
                topologicalsort(visited,st,i);
            }
        }

        while (!st.empty())
        {
            System.out.print(st.pop()+" ");
        }

    }
    private void topologicalsort(boolean[] visited,Stack<Integer>st,int source)
    {
        visited[source]=true;
        for(int n:adj[source])
        {
            if(!visited[n])
            {
                topologicalsort(visited,st,n);
            }
        }
        st.push(source);
    }
}
public class TopologicalSort {
    public static void main(String[] args)
    {    Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertex");
        int n  = sc.nextInt();
        pathGraph graph = new pathGraph(n);
        System.out.println("Enter the number of edges");
        int e = sc.nextInt();
        System.out.println("Enter the edges");
        for(int i=0;i<n;i++)
        {
            int source= sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdges(source,destination);
        }
    }
}
