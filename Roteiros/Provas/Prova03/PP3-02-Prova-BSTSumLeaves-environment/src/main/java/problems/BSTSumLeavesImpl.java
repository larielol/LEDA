package problems;

import adt.bst.BST;
import adt.bt.BTNode;

public class BSTSumLeavesImpl implements BSTSumLeaves{
    public int sumLeaves(BST<Integer> bst){
        int sum = 0;
        
        if (bst != null && !bst.isEmpty()) {
        	if (bst.getRoot().isLeaf()) {
        		sum += bst.getRoot().getData();
        	} else {
        		if (bst.getRoot().getLeft().isLeaf()) {
        			sum += bst.getRoot().getLeft().getData();
        		} 
        		
        		if (bst.getRoot().getRight().isLeaf()) {
        			sum += bst.getRoot().getRight().getData();
        		}
        	}
        }
        return sum;
    } 

	public int sumLeavesRecursive(BST<Integer> bst) {
		int sum;
		return sum;
	}
}
