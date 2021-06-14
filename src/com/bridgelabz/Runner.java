package com.bridgelabz;

public class Runner {
	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(22);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(40);
		myBinaryTree.add(70);
		myBinaryTree.add(60);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		myBinaryTree.add(95);
		myBinaryTree.inorder();
		System.out.println("Total number of tree elements " + myBinaryTree.getSize());
	}
}
