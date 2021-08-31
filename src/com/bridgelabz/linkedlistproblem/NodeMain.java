package com.bridgelabz.linkedlistproblem;

public class NodeMain {

	public static void main(String[] args) {

		Node<Integer> firstNode = new Node(56);
		Node<Integer> secondNode = new Node(30);
		Node<Integer> thirdNode = new Node(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(thirdNode);
		myLinkedList.insertNodeBetween(firstNode, secondNode, thirdNode);
		myLinkedList.printMyNodes();
	}

}
