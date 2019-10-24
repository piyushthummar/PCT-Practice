package com.piyush.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph_BFS {
	private static List<Integer> visitedVertices;
	private static Queue<Integer> queue;
		
	/**
	 * 
	 */
	public Graph_BFS() {
		this.visitedVertices = new ArrayList<Integer>();
		this.queue = new LinkedList<>();
	}
	
	public void traverseGraph(Graph graph, int startingNode)
	{
		int node = startingNode;
		//this.queue.add(node);
		this.visitedVertices.add(node);
		do
		{
			//System.out.println("in do");
			
			//System.out.println(this.visitedVertices);
			
			if(graph.adjacencyList[node] != null)
			{
				for(int item : graph.adjacencyList[node])
				{
					if( !(this.visitedVertices.contains(item) || this.queue.contains(item)) )//if item is already there in visited vertices list
					{
						this.visitedVertices.add(item);
					}
					else
					{
						continue;
					}			
				}
			}
			else
			{
				// Write code for a node which has no neighbours
			}
			
			this.queue.add(node);

			if(this.visitedVertices.size() > 0)
			{
				this.visitedVertices.remove(this.visitedVertices.indexOf(node));
			}
			else
			{
				continue;
			}
			
			if(this.visitedVertices.size() > 0)
			{
				node = this.visitedVertices.get(0);
			}
			else
			{
				continue;
			}

			
			System.out.println("Visited Vertices : " + this.visitedVertices);
			System.out.println("Queue : " + this.queue);
		}while(!this.queue.isEmpty());
		
		System.out.println("Yes!! BFS Traversal Completed!!");
	}
	
}
