package com.first.learning.AWS;



public class LinkedList<T> {

	public static Node head = null;
	// insert
	public void insert(T data) {
		Node<T> node = new Node(data);
		if(head ==null) {
			head = node;
		}else {
			node.next = head;
			head = node;
		}
	}
	
	public void insertLast(T data) {
		Node<T> node = new Node(data);
		Node<T> last = null;
		
		if(head ==null) {
			head = node;
			last = node;
		}else {
			if(last == null) {
				last = head;
				while(last.next != null ) {
					last = last.next;
				}
			}
			last.next = node;
			last = node;
		}
	}
	// Travers
	public void traverse(){
		Node ptr = head;
		while(ptr !=null) {
			System.out.print(ptr.val+"--");
			ptr = ptr.next;
		}
	}
	// revers
	public void reverse(Node ptr) {
		if(ptr ==null) {
			return;
		}
		reverse(ptr.next);
		System.out.print("--"+ptr.val);
	}
	
	public void nthLast(Node ptr, int n, int k) {
		
		if(ptr ==null) {
			return;
		}
		nthLast(ptr.next,n,k+1 );
		//System.out.println(k);
		if(k == n) {
			System.out.print("--"+ptr.val);
		}
	}

	public void nthWithoutRec(Node head2, int n) {
		// TODO Auto-generated method stub
		
		Node p1= head2;
		int i=0;
		while(i<n) {
			p1=p1.next;
			i++;
		}
		Node p2 = head2;
		while(p1!=null) {
			p1=p1.next;
			p2 = p2.next;
		}
		System.out.println(" N the from Last :"+p2.val);
		
	}

	public void reverseNode(Node ptr) {
		// TODO Auto-generated method stub
		if(ptr == null )
		   return;
		
		   reverseNode(ptr.next);
		   ptr.next = head;
		   head = ptr;
	}
	
	
	
}

class Node <T>{
    T val;
    Node next;

    public Node(final T val) {
        this.val = val;
        this.next= null;
    }


}

