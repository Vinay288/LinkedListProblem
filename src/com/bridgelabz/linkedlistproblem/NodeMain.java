package com.bridgelabz.linkedlistproblem;

public class NodeMain {

	public static void main(String[] args) {

		Node<Integer> firstNode = new Node(56);
		Node<Integer> secondNode = new Node(30);
		Node<Integer> thirdNode = new Node(70);
		Node<Integer> fourthNode= new Node(40);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.append(fourthNode);
		myLinkedList.delete(40);
		myLinkedList.printMyNodes();
	}

}
