package Tree;

public class tree<K extends Comparable<K>, V> {
	Node root = null;
	int N = 0;

	class Node {
		K key;
		V value;
		Node left;
		Node right;

		public Node(K key, V value, tree<K, V>.Node left, tree<K, V>.Node right) {
			this.key = key;
			this.value = value;
			this.left = left;
			this.right = right;
		}

	}

	public void put(K key, V value) {
		root = put(root, key, value);
	}

	public Node put(Node x, K key, V value) {
		if (x == null) {
			N++;
			return new Node(key, value, null, null);
		} else {
			if (key.compareTo(x.key) < 0) {
				x.left = put(x.left, key, value);
			} else if (key.compareTo(x.key) > 0) {
				x.right = put(x.right, key, value);
			} else
				x.value = value;

			return x;
		}
	}

	public K get(K key) {
		K k = get(root, key);
		return k;
	}

	public K get(Node x, K key) {
		if (x == null)
			return null;
		else {
			K k = null;
			if (key.compareTo(x.key) < 0) {
				k = get(x.left, key);	
			} else if (key.compareTo(x.key) > 0) {
				k = get(x.right, key);
			} else
				return k;
			return k;
		}	
	}
	
	//delete
}
