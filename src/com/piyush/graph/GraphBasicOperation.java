/**
 * 
 */
package com.piyush.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author PIYUSH
 * 
 */
public class GraphBasicOperation {


	public static void main(String[] args) {
		int vertices, src, dest, edges;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number of Vertices : ");
		vertices = scanner.nextInt();
		
		Graph graph = new Graph(vertices);
		
		System.out.print("Enter Number of Edges you want to add : ");
		edges = scanner.nextInt();
		
		for(int index=0; index<edges; index++)
		{
			System.out.print("Enter Source Vertex : ");
			src = scanner.nextInt();
			System.out.print("Enter Destination Vertex : ");
			dest = scanner.nextInt();
			graph.addEdgeForUndirectedGraph(src, dest);
		}
		
		int startingNode;
		
//		System.out.println("Printing Graph on the screen...");
//		graph.printGraph();
		
		// BFS Traversal of Graph ...
//		System.out.println("\nBFS Traversing of graph started...");
//		Graph_BFS bfs = new Graph_BFS();
//		System.out.print("Enter starting node : ");
//		startingNode = scanner.nextInt();
//		bfs.traverseGraph(graph, startingNode);
		
		
		// DFS Traversal of Graph...
		System.out.println("\nDFS Traversal of graph started...");
		Graph_DFS dfs = new Graph_DFS();
		System.out.print("Enter Starting node : ");
		startingNode = scanner.nextInt();
		dfs.traverseConnectedGraph(graph, startingNode);
	}

}
