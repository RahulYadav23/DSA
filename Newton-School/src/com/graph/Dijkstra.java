package com.graph;

import java.util.*;
class Pair implements Comparable<Pair>{
    public Pair(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    int vertex;
    int weight;

    @Override
    public int compareTo(Pair o) {
        return this.weight-o.weight;
    }




}
class WtdGraph{
    public WtdGraph(int vertices) {
        adj = new ArrayList[vertices];
    }
    public void addEdge(int source,int destination,int weight)
    {
        adj[source].add(new Pair(destination,weight));
        adj[destination].add(new Pair(source,weight));
    }

    ArrayList<Pair>[] adj;
}
public class Dijkstra {

    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices = sc.nextInt();
        WtdGraph gp = new WtdGraph(vertices);
        System.out.println("Enter the number of edges");
        int edges =sc.nextInt();
        System.out.println("Enter the source and destination of edges");
        for(int i=0;i<edges;i++)
        {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            int weight = sc.nextInt();
            gp.addEdge(source,destination,weight);

        }

    }

    public  void dijkstra(int source,WtdGraph graph)
    {
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        int[] distance = new int[graph.adj.length];
        Arrays.fill(distance,Integer.MAX_VALUE);
        boolean[] visited = new boolean[graph.adj.length];
        queue.add(new Pair(source,0));


        while (!queue.isEmpty())
        {
            Pair current = queue.poll();

            if(visited[current.vertex])
                continue;

            visited[current.vertex]=true;
            distance[current.vertex]= current.weight;
            for(Pair neighbour:graph.adj[current.vertex])
            {
                 if(!visited[neighbour.vertex])
                 {
                     if (distance[neighbour.vertex] > current.weight + neighbour.weight)
                         queue.add(new Pair(neighbour.vertex, current.weight + neighbour.weight));
                 }

            }
        }

        System.out.print(Arrays.toString(distance));
    }


}




