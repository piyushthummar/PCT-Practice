package com.piyush.graph;

import java.util.LinkedList;
import java.util.List;

public class Graph {

	int vertices;
	static List<Integer> adjacencyList[];
	
	public Graph(int vertices) {
		this.vertices = vertices;
		
		adjacencyList = new LinkedList[vertices];
		
		for(int index=0; index<vertices; index++)
			adjacencyList[index] = new LinkedList<>();
	}
	
	public void addEdgeForUndirectedGraph(int srcVertex, int destVertex)
	{
		adjacencyList[srcVertex].add(destVertex);
		adjacencyList[destVertex].add(srcVertex);
	}
	
	public void addEdgeForDirectedGraph(int srcVertex, int destVertex)
	{
		adjacencyList[srcVertex].add(destVertex);
	}
	
	public void printGraph()
	{
		//System.out.println("inside printGraph");
		for(int index=0; index<vertices; index++)
		{
			System.out.println("\nAdjacency list of vertex " + index);
			System.out.print(index + "(head)");
			for(Integer item : adjacencyList[index])
			{
				System.out.print(" -> " + item);
			}
			System.out.println();
		}
	}
}
