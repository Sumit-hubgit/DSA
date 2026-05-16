package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSPRACTice {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int V=inp.nextInt();
        int E= inp.nextInt();

        ArrayList<ArrayList<Integer>>adjL=new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjL.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int u = inp.nextInt();
            int v = inp.nextInt();
            adjL.get(u).add(v);
            adjL.get(v).add(u); // Because the graph is undirected
        }

        boolean[]visited=new boolean[V];
        ArrayList<Integer>result=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while (!q.isEmpty()){
            Integer node=q.poll();
            result.add(node);
            for (Integer it: adjL.get(node)){
                if(!visited[it]){
                    visited[it]=true;
                    q.add(it);
                }
            }
        }
        System.out.println(result);
    }
}
