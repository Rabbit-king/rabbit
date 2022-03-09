package SequenceList;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T> {
	private int N = 0;// 链表长度
	Node head = null;
	class Node{
		T value;
		Node next;
		public Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	public LinkList() {
		this.N = 0;
		this.head = new Node(null,null);
		//头结点的数据域无意义
	}
	public void insert(T t) {
		Node n=head;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=new Node(t,null);
		N++;
	}
	public void clear() {
		head.next=null;
	}
	public boolean isEmpty() {
		return N==0;
	}
	public int length() {
		return N;
	}
	public T get(int index) {
		Node n=head;
		for(int i=0;i<index;i++) {
			n=n.next;
		}
		return n.value;
	}
	public void insert(int index,T t) {
		Node n=head;
		for(int i=0;i<index;i++) {
			n=n.next;
		}
		n.next=new Node(t,n.next);
		N++;
	}
	public T remove(int index) {
		Node pre=head;
		for(int i=0;i<index-1;i++) {
			pre=pre.next;
		}
		Node n=pre.next;
		pre.next=n.next;	
		return n.value;
	}
	public int indexOf(T t) {
		Node n=head;
		int i=-1;
		while(n.next!=null) {
			n=n.next;
			i++;
			if(n.value.equals(t))
				return i;
		}
		return -1;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}	
	class SIterator implements Iterator{
		private  Node n;	
		public SIterator() {
			n=head;
		}
		@Override
		public boolean hasNext() {
			return n.next!=null;
		}
		@Override
		public Object next() {
			n=n.next;
			return n.value;	
		}	
	}
}
