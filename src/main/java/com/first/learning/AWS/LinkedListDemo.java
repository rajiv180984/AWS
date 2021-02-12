package com.first.learning.AWS;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.traverse();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		
		list.traverse();
		list.insertLast(10);
		list.insertLast(20);
		System.out.println(" ============");
		list.traverse();
		list.reverse(LinkedList.head);
		System.out.println(" ======*======");
		list.nthLast(LinkedList.head,2 , 1);
		//list.traverse();
		System.out.println(" ======***======");
			
		list.nthWithoutRec(LinkedList.head, 2);
		list.reverseNode(LinkedList.head);
		
	}
	
}
