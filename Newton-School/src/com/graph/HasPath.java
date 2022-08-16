package com.graph;
import  java.util.*;
class pathGraph{
   ArrayList<Integer>[] adj;

   pathGraph(int vertices)
   {
       adj = new ArrayList[vertices];
       for(int i=0;i<vertices;i++)
       {
           adj[i]=new ArrayList<>();
       }

   }
    public void addEdges(int source , int destination)
    {
         adj[source].add(destination);
         adj[destination].add(source);
    }

    public boolean haspath(int source,int destination)
    {
        boolean[] visited = new boolean[adj.length];
        return  haspath(source,destination,visited);
    }
    public void printpath(int source,int destination)
    {

    }
    private void printAllPath(int source,int destination,boolean[] visited,String path)
    {
        if(source==destination)
        {
            System.out.println(path);
        }
        visited[source]=true;
        for(int n : adj[source])
        {
            if(!visited[n])
            {
                printAllPath(n,destination,visited,path+"->"+n);
            }
        }
        visited[source]=false;
    }
    private boolean haspath(int source,int destination,boolean[] visited)
    {
        if(source==destination)
            return true;

        visited[source]=true;

        for(int nei: adj[source])
        {
            if(!visited[nei])
            {
                if(haspath(nei,destination,visited))
                    return true;
            }
        }

        return false;
    }

    public void HamiltonianPath(int source)
    {
        HashSet<Integer> visited = new HashSet<>();

        HamiltonPC(source,visited,source,"");
    }

    private  void HamiltonPC(int source,HashSet<Integer> visited,int orgsrc,String path)
    {
         if(visited.size()== adj.length-1)
         {
             boolean cycle=false;

             for(int n: adj[source])
             {
                 if(n==orgsrc)
                 {
                     cycle=true;
                     break;
                 }
             }

             if(cycle)
             {
                 System.out.println("Cycle"+path);
             }
             else
             {
                 System.out.println("path"+path);
             }
         }

         visited.add(source);
         for(int n:adj[source])
         {
             if(!visited.contains(n))
             {
                 HamiltonPC(n,visited,orgsrc,path+"->"+n);
             }
         }
         visited.remove(source);
    }

}
public class HasPath {
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
