package crakingthecodinginterview.graphs;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepths {

    ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {

        ArrayList<LinkedList<TreeNode>> resultList = new ArrayList<>();
        LinkedList<TreeNode> current = new LinkedList<>();
        if (root != null){
            current.add(root);
        }

        while (current.size() > 0){
            resultList.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<>();
            for (TreeNode parent : parents){
                if (parent.leftChild != null){
                    current.add(parent.leftChild);
                }
                if (parent.rightChild != null){
                    current.add(parent.rightChild);
                }
            }

        }
        return resultList;
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

        ListOfDepths listOfDepths = new ListOfDepths();
        System.out.println(listOfDepths.createLevelLinkedList(node));
    }

}
