/**
 * 
 */
package com.piyush.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author PIYUSH
 *
 */
public class Graph_DFS {

	private static Stack<Integer> stack;
	private static boolean[] visitedVertices;
	private static List<Integer> traversalOutput;
	
	
	/**
	 * 
	 */
	public Graph_DFS() {
		stack = new Stack<>();
		traversalOutput = new ArrayList<>();
	}

	public int getNextNode(Graph graph, int currentNode)
	{
		int nextNode = currentNode;
		for(int item : graph.adjacencyList[currentNode])
		{
			if(visitedVertices[item] == false)
			{
				nextNode = item;
				break;
			}
			else
			{
				continue;
			}
		}
		
		if(nextNode != currentNode)
		{
			return nextNode;
		}
		else
		{
			//System.out.println("before pop -> " + stack);
			stack.pop();
			if(stack.isEmpty())
			{
				return 999;
			}
			else
			{
				
				//System.out.println(this.stack);
				return getNextNode(graph, stack.peek());
			}
		}
	}
	
	public void traverseConnectedGraph(Graph graph, int startingNode)
	{
		visitedVertices = new boolean[graph.vertices];
		//initializing visited vertices to false means none of the vertices visited
		for(int index=0; index<graph.vertices; index++)
		{
			visitedVertices[index] = false;
		}
		
		int node = startingNode;
//		this.visitedVertices[node] = true;
//		this.traversalOutput.add(node);
		
		do
		{
			if(graph.adjacencyList[node] != null)
			{
				if(this.visitedVertices[node] == false)
				{
					stack.add(node);
					traversalOutput.add(node);
					visitedVertices[node] = true;
				}else
				{
					// What if element is already present in stack
					continue;
				}
				
				// if getNextNode returns the same node as next node, 
				// that means the current node has no adjacent nodes which are not visited. 
				// So, we need to pop-up that node, which is written in getNestNode method.
				node = this.getNextNode(graph, stack.peek());
				if(node == 999)
				{
					break;
				}
				else
				{
					System.out.println("Stack : " + stack);
					System.out.println("Traversal Output : " + traversalOutput);
				}

				//System.out.println("Visited Vertices Boolean Array : " + Arrays.asList(this.visitedVertices));
			}
			else
			{
				// Write code for a node which has no neighbour
			}
		}while(!this.stack.isEmpty());
		
		int count = 0;
		for(int index=0; index<graph.vertices; index++)
		{
			if(this.visitedVertices[index] == true)
			{
				count++;
			}
		}
		if(count == graph.vertices && traversalOutput.size() == count)
		{
			System.out.println("Yes!! DFS Traversal Completed");
			System.out.println("Traversal order for connected graph is : " + traversalOutput);
		}
		else
		{
			System.out.println("OOPS!! DFS traversal not completed");
			
		}
		
	}
	
	
//	public void traverseDisconnectedGraph(Graph graph, int startingNode)
//	{
//		// Write Implementation logic here...
//	}
}
