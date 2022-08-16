package com.graph;

import java.util.ArrayList;

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
}
public class TopologicalSort {

}
