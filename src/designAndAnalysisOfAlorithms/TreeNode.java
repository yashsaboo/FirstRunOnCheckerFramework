package designAndAnalysisOfAlorithms;


import org.checkerframework.checker.initialization.qual.Initialized;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class TreeNode {
		
	int data;
	@Nullable TreeNode left;
	@Nullable TreeNode right;
	@Nullable TreeNode next;
	
	public TreeNode() {
		data=0;
		left = null;
		right = null;
		next = null;
	}

	public TreeNode(int data, @Initialized @NonNull TreeNode left, TreeNode right, TreeNode next) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public void setNext(TreeNode next) {
		this.next = next;
	}
}

