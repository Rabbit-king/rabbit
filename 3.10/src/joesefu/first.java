package joesefu;

//Լɪ�����⣬��n���ˣ���1��ʼ����������3�����˳�����ʣ����������

public class first {
	public static void main(String[] args) {
		Link l = new Link();

		for (int i = 1; i < 42; i++) {
			l.add(i);
		}

		l.left(3);
	}
}

class Node {
	int val;
	Node next;

	public Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
}

class Link {
	Node head = new Node(0, null);
	Node last = head;
	int N = 0;
	public void add(int i) {
		if (N == 0) {
			head.val = i;
			N++;
		} else {
			last.next = new Node(i, head);
			last = last.next;
			N++;
		}
	}
	public Node left(int n) {
		Node temp = last;
		int i = 0;
		while (true) {
			if (N < n) 
				break;
			i++;
			temp=temp.next;
			if (i % (n - 1) == 0) {
				temp.next = temp.next.next;
				N--;
				i = 0;
			}
		}
		return temp;
	}
}

//��ʹͷ��㲻��Ҳ���ԣ���temp����������һ��ʼ�����ˣ���Ӧ�ÿ�head����last