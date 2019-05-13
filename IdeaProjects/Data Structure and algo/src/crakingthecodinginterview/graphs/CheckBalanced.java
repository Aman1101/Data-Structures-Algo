package crakingthecodinginterview.graphs;

import tree.TreeNode;

public class CheckBalanced {

    boolean isBalanced(TreeNode root){
        if (root == null){
            return  true;
        }
        int heightDiff = getHeight(root.leftChild) - getHeight(root.rightChild);
        if(Math.abs(heightDiff) > 1){
            return false;
        }else {
            return isBalanced(root.leftChild) && isBalanced(root.rightChild);
        }
    }
    int getHeight(TreeNode root) {
        if (root == null) return -1;
        return Math.max(getHeight(root.leftChild), getHeight(root.rightChild)) + 1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(10);
        node.leftChild = new TreeNode(8);
        node.rightChild = new TreeNode(18);
        node.leftChild.leftChild = new TreeNode(6);
        node.leftChild.rightChild = new TreeNode(7);
        node.rightChild.leftChild = new TreeNode(12);
        node.rightChild.leftChild.leftChild = new TreeNode(13);
        node.rightChild.rightChild = new TreeNode(20);
        node.rightChild.leftChild.leftChild.leftChild = new TreeNode(50);

        CheckBalanced balanced = new CheckBalanced();

        System.out.printf(""+ balanced.isBalanced(node));
    }

}
