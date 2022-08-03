package com.graph;

import java.util.*;

public class graph {

    ArrayList<Integer>[] adj;

    graph(int vertices)
    {
        adj = new ArrayList[vertices];
        for(int i=0;i<vertices;i++)
        {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdges(int source ,int destination)
    {
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public void  dfs(int source)
    {
        boolean[] visited = new boolean[adj.length];
        dfsUtil(source,visited);
    }

    private void dfsUtil(int source,boolean[] visited)
    {
        visited[source] = true;
        System.out.print(source+" ");
        for(int node:adj[source])
        {
            if(!visited[node])
                dfsUtil(node,visited);
        }
    }

    public void bfs(int source)
    {
        boolean[] visited  = new boolean[adj.length];
        Queue<Integer> queue = new LinkedList<>();
        int[] level = new int[adj.length];
        level[source]=0;
        queue.add(source);
        visited[source]=true;
        while (!queue.isEmpty())
        {
            int currSource = queue.remove();
            System.out.print(currSource+" ");
            for(int nb : adj[currSource])
            {
                if(!visited[nb]) {
                    queue.add(nb);
                    visited[nb]=true;
                    level[nb] = level[currSource]+1;
                }
            }
        }
    }

    public int[] level(int source)
    {
        boolean[] visited  = new boolean[adj.length];
        Queue<Integer> queue = new LinkedList<>();
        int[] level = new int[adj.length];
        level[source]=0;
        queue.add(source);
        visited[source]=true;
        while (!queue.isEmpty())
        {
            int currSource = queue.remove();
            System.out.print(currSource+" ");
            for(int nb : adj[currSource])
            {
                if(!visited[nb]) {
                    queue.add(nb);
                    visited[nb]=true;
                    level[nb] = level[currSource]+1;
                }
            }
        }

        return level;
    }

    public boolean isCyclic(int source)
    {
        boolean[] visited  = new boolean[adj.length];
        Queue<Integer> queue = new LinkedList<>();


        queue.add(source);

        while (!queue.isEmpty())
        {
            int currSource = queue.remove();
            if(visited[currSource]==true)
                return true;
            visited[currSource]=true;
            System.out.print(currSource+" ");
            for(int nb : adj[currSource])
            {
                if(!visited[nb]) {
                    queue.add(nb);
                }
            }
        }

        return false;
    }

    public void countComponents()
    {
        boolean[] visited  = new boolean[adj.length];
        Queue<Integer> queue = new LinkedList<>();
        int source =0;
        boolean flag = false;
        int count =0;
        while (!flag) {
            queue.add(source);
            visited[source] = true;
            while (!queue.isEmpty()) {
                int currSource = queue.remove();

                for (int nb : adj[currSource]) {
                    if (!visited[nb]) {
                        queue.add(nb);
                        visited[nb] = true;

                    }
                }
            }

            for(int i=0;i< visited.length;i++)
            {
                if(visited[i]==false)
                {
                    flag = false;
                    source=i;
                    break;
                }
                else
                {
                    flag=true;
                }
            }

            count++;
        }

        System.out.print("Number of Components"+count);
    }

    class Pair{
        public Pair(int vertice, int level) {
            this.vertice = vertice;
            this.level = level;
        }

        int vertice;
        int level;
    }

}
