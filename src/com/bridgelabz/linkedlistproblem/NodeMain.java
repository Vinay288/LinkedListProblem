package com.bridgelabz.linkedlistproblem;

public class NodeMain {

	public static void main(String[] args) {

		Node<Integer> firstNode = new Node(56);
		Node<Integer> secondNode = new Node(30);
		Node<Integer> thirdNode = new Node(70);
		Node<Integer> fourthNode= new Node(40);
		SortedLinkedList<Integer> sortedLinkedList= new SortedLinkedList<Integer>();
		sortedLinkedList.append(firstNode);
		sortedLinkedList.append(secondNode);
		sortedLinkedList.append(thirdNode);
		sortedLinkedList.append(fourthNode);
		sortedLinkedList.printMyNodes();
	}

}
