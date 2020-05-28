package com.piyush.lab_problems;

import java.util.ArrayList;
import java.util.Scanner;

class Node{
	int value;
	Node left;
	Node right;
	
	Node(){
		this.value = 0;
		this.left = null;
		this.right = null;
	}
	
	Node(int val, Node leftNode, Node rightNode){
		this.value = val;
		this.left = leftNode;
		this.right = rightNode;
	}
}

public class Lab_4_AVLTreeOrNot {

	public static int leftHeight = 0, rightHeight = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		ArrayList<Integer> nodes = new ArrayList<>();
		int index = 0; 
		
		for(String ch : input.split(" ")) {
			if(Integer.parseInt(ch) == -1) {
				break;
			}
			nodes.add(Integer.parseInt(ch));	
		}	
		
		Node root = new Node();
		root.value = nodes.get(0);
		for(index = 1; index < nodes.size(); index++) {
			addNodeToTree(nodes.get(index), root);
		}
		
		preorderTrversal(root);
	}
	
	public static void addNodeToTree(int newValue, Node root) {
		if(newValue < root.value) {
			if(root.left == null) {
				root.left = new Node();
				root.left.value = newValue;
			}
			else {
				addNodeToTree(newValue, root.left);
			}

		} else if(newValue > root.value) {
			if(root.right == null) {
				root.right = new Node();
				root.right.value = newValue;
			}
			else {
				addNodeToTree(newValue, root.right);
			}
		} else {
			System.out.println("Same element cannot be inserted in the Tree.");
		}
	}

	
	public static void preorderTrversal(Node root) {
		System.out.print(root.value + " ");
		if(root.left != null) {
			preorderTrversal(root.left);
		}
		if(root.right != null) {
			preorderTrversal(root.right);
		}
	}
	
	public static boolean isAVL(Node root) {
		
		return false;
	}
	
	public static int checkLeftHeight(Node root) {
		leftHeight++;
		if(root.left != null) {
			checkLeftHeight(root.left);
		}
		return leftHeight;
	}
	public static int checkRightHeight(Node root) {
		return rightHeight;
	}
}
