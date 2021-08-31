package com.bridgelabz.linkedlistproblem;

public class MyLinkedList<K> {
	private K key;
	private INode head;
	private INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (tail == null)
			this.tail = newNode;
		if (head == null)
			this.head = newNode;
		else
			newNode.setNext(head);
		head = newNode;
	}

	public void printMyNodes() {
		INode tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}
		System.out.print("null");
	}

	public void append(INode newNode) {
		if (tail == null)
			this.tail = newNode;
		if (head == null)
			this.head = newNode;
		else
			tail.setNext(newNode);
		tail = newNode;
	}

	public void insertNodeBetween(INode beforeNode, INode newNode, INode afterNode) {
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			if (tempNode == beforeNode && tempNode.getNext() == afterNode) {
				newNode.setNext(tempNode.getNext());
				beforeNode.setNext(newNode);
			}
			tempNode = tempNode.getNext();
		}
	}

	public void popFirst() {
		INode deletedNode = head;
		head = head.getNext();
		System.out.println("deleted " + deletedNode.getKey());
		deletedNode = null;
	}

	public void popLast() {
		INode previousNode = null, currentNode = head;
		while (currentNode.getNext() != null) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		previousNode.setNext(null);
		tail = previousNode;
		System.out.println("deleted " + currentNode.getKey());
		currentNode = null;
	}

	public void find(K key) {
		int index = 1;
		INode currentNode = head;
		while (currentNode != null) {
			if (currentNode.getKey() == key) {
				System.out.println("key found at index " + index);
				break;
			}
			currentNode = currentNode.getNext();
			index++;
		}
	}

	public void insertAfter(INode previousNode, INode newNode) {
		INode currentNode = head;
		while (currentNode != previousNode && currentNode != null) {
			currentNode = currentNode.getNext();
			
		}
		if (currentNode == previousNode) {
			newNode.setNext(currentNode.getNext());
			currentNode.setNext(newNode);
		}
	}
	public void delete(K key) {
		INode currentNode = head,previousNode=null;
		while(currentNode!=null) {
			if(currentNode.getKey().equals(key)) {
				if(currentNode.getNext()==null) {
					previousNode.setNext(null);
				}
				else
				previousNode.setNext(currentNode.getNext());
				currentNode=null;
				System.out.println(key+" deleted");
				break;
			}
			previousNode=currentNode;
			currentNode=currentNode.getNext();
		}
	}
}
