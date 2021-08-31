package com.bridgelabz.linkedlistproblem;

public class NodeMain {

	public static void main(String[] args) {
		
		Node<Integer> firstNode = new Node(56);
		Node<Integer> secondNode = new Node(30);
		Node<Integer> thirdNode = new Node(70);
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		
		System.out.println(firstNode.key+"->"+firstNode.next.key+"->"+firstNode.next.next.key);

	}

}
