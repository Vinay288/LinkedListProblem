package com.bridgelabz.linkedlistproblem;

public class MyLinkedList {

	private INode head;
	private INode tail;

	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}
	public void add(INode newNode) {
		if(tail==null)
			this.tail=newNode;
		if(head==null)
			this.head=newNode;
		else
			newNode.setNext(head);
			head=newNode;
	}
	public void printMyNodes() {
		INode tempNode = head;
		while(tempNode!=null) {
			System.out.print(tempNode.getKey()+"->");
			tempNode=tempNode.getNext();
		}
		System.out.print("null");
	}
	
	public void append(INode newNode) {
		if(tail==null)
			this.tail=newNode;
		if(head==null)
			this.head=newNode;
		else
			tail.setNext(newNode);
			tail=newNode;
	}
	public void insertNodeBetween(INode beforeNode,INode newNode,INode afterNode) {
		INode tempNode = head;
		while(tempNode.getNext()!=null) {
			if(tempNode==beforeNode && tempNode.getNext()==afterNode) {
				newNode.setNext(tempNode.getNext());
				beforeNode.setNext(newNode);
			}
			tempNode=tempNode.getNext();
		}
	}
}
