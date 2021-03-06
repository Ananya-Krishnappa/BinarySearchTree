package com.bridgelabz;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return current;
		}
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	/**
	 * This method mainly calls InorderRec()
	 */
	void inorder() {
		inorderRec(root);
	}

	/**
	 * A utility function to do inorder traversal of BST
	 * 
	 * @param root
	 */
	void inorderRec(MyBinaryNode<K> root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	public MyBinaryNode<K> search(K key) {
		return search(root, key);
	}

	/**
	 * A utility function to search a given key in BST
	 * 
	 * @param root
	 * @param key
	 * @return
	 */
	private MyBinaryNode<K> search(MyBinaryNode<K> root, K key) {
		// Base Cases: root is null or key is present at root
		if (root == null || root.key == key)
			return root;
		// Key is greater than root's key
		int compareResult = root.key.compareTo(key);
		if (compareResult < 0) {
			return search(root.right, key);
		}
		// Key is smaller than root's key
		return search(root.left, key);
	}
}
