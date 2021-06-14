package com.bridgelabz;

public interface INode<K extends Comparable<K>> {
	public K getKey();

	public void setKey(K key);

	public INode<K> getLeft();

	public void setLeft(INode<K> left);

	public INode<K> getRight();

	public void setRight(INode<K> right);

}
