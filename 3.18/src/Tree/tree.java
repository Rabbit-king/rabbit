package Tree;

public class tree {
	Node root;
	int N;

	class Node {
		Comparable key;
		Comparable value;
		Node left;
		Node right;

		public Node(Comparable key, Comparable value, Node left, Node right) {
			this.key = key;
			this.value = value;
			this.left = left;
			this.right = right;
		}

	}

	public void put(Comparable k, Comparable v) {
		root = put(root, k, v);
	}

	public Node put(Node T, Comparable k, Comparable v) {
		if (T == null) {
			N++;
			return new Node(k, v, null, null);
		}
		else {
			if (T.key.compareTo(k) < 0) {
				T.right = put(T.right, k, v);
			} else if (T.key.compareTo(k) > 0) {
				T.left = put(T.left, k, v);
			} else {
				T.value = v;
			}
			return T;
		}
	}

	public Comparable get(Comparable k) {
		return get(root, k);
	}

	public Comparable get(Node T, Comparable k) {
		if (T == null)
			return null;

		if (T.key.compareTo(k) == 0)
			return T.value;
		else if (T.key.compareTo(k) < 0)
			return get(T.right, k);
		else
			return get(T.left, k);
	}

	public Node delete(Comparable k) {
		N--;
		return root = delete(root, k);
	}

	public Node delete(Node T, Comparable k) {
		if (T == null)
			return null;

		if (T.key.compareTo(k) > 0)
			T.left = delete(T.left, k);
		else if (T.key.compareTo(k) < 0)
			T.right = delete(T.right, k);
		else {
			if (T.left == null)
				return T.right;
			if (T.right == null)
				return T.left;
			else {
				if (T.right.left == null) {
					T.right.left = T.left;
					return T.right;
					// 这是重点，因为如果右子树中的最小值结点就是右孩子结点
					// 那它的pre结点就是要被删除的结点,会造成混乱
				} else {
					Node min = T.right;
					Node pre = T;

					while (min.left != null) {
						pre = min;
						min = min.left;
					}

					T.key = min.key;
					T.value = T.value;
					pre.left = min.right;

					return T;
				}
			}
		}
		return T;
	}

	public void pre(Node T) {
		if (T == null)
			return;
		pre(T.left);
		System.out.print(T.key + " ");
		pre(T.right);
	}
	
	public int deep(Node T) {
		int leftmax;
		int rightmax;
		if(T==null) {
			return 0;
		}
		leftmax=deep(T.left)+1;
		rightmax=deep(T.right)+1;
		return leftmax>rightmax?leftmax:rightmax;
	}
}
