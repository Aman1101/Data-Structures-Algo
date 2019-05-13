package crakingthecodinginterview.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenNodes {

    private int v;
    private LinkedList<Integer> adjList [];


    public RouteBetweenNodes(int v) {
        this.v = v;
        adjList = new LinkedList[v];
        for (int i=0; i < v; i++){
            adjList[i] = new LinkedList<Integer>();
        }
    }

    void addEdge (int src, int dest){
        adjList[src].add(dest);
    }

    boolean bfs(int startVertex, int endVertex){
        boolean [] visited = new boolean[v];
        Queue<Integer> tempQueue = new LinkedList<>();
        visited[startVertex] = true;
        tempQueue.add(startVertex);

       // outerloop:
        while (!tempQueue.isEmpty()){
            startVertex = tempQueue.poll();

            Iterator<Integer> itr = adjList[startVertex].iterator();

            while (itr.hasNext()){
                int n = itr.next();
                if(n == endVertex){
                    //System.out.println("Path exist");
                    return true;
                   // break outerloop;
                }else
                    if (!visited[n]){
                        visited[n] = true;
                        tempQueue.add(n);
                    }
            }
        }
        return false;
    }


    public static void main(String[] args) {

        RouteBetweenNodes g = new RouteBetweenNodes(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        //g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        System.out.println("Path Exist : " + g.bfs(2,3));
    }

}
