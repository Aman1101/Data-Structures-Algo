package crakingthecodinginterview.graphs;

import tree.TreeNode;

public class MinimalTree {

    TreeNode minimalBST(int [] arr){

        return minimalBSTUtil(arr, 0, arr.length-1);
    }

    TreeNode minimalBSTUtil(int [] arr, int start, int end){
        if (end < start){
            return null;
        }

        int mid = (end + start)/2;

        TreeNode t = new TreeNode(arr[mid]);
        t.leftChild = minimalBSTUtil(arr, start, mid-1);
        t.rightChild = minimalBSTUtil(arr, mid+1, end);
        return t;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,11,12,13,14,15};
        MinimalTree minTree = new MinimalTree();
        System.out.println(minTree.minimalBST(arr));
    }

}
