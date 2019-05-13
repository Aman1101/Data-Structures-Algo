package tree;

public class BinarySearchTree {

    private TreeNode root;

    public void insert (Integer data){

        if (root == null){
            this.root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    public TreeNode find (Integer data){

        if(root != null){
            return root.find(data);
        }
        return null;
    }

    public void traverseInOrder(){
        if(root != null)
            this.root.traverseInOrder();
        System.out.println();

    }
    public void traversePreOrder(){
        if (root != null)
            this.root.traversePreOrder();
        System.out.println();
    }
    public void traversePostOrder(){
        if (root != null)
            this.root.traversePostOrder();
        System.out.println();
    }

    public void delete (Integer data) {
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;

        if (current == null){
            return;
        }

        while (current != null && current.getData() != data){

            if (data < current.getData()){
                current = current.getLeftChild();
                isLeftChild = true;
            } else {
                current = current.getRightChild();
                isLeftChild = false;
            }
        }

        if (current == null){
                return;
        }
        if (current.getLeftChild() == null && current.getRightChild() == null){

            if (current == root){
                root = null;
            } else {
                if (isLeftChild){
                    current.setLeftChild(null);
                } else{
                    current.setRightChild(null);
                }
            }
        }  else if (current.getRightChild() == null) {
            if (current == root){
                root = current.getLeftChild();
            } else if (isLeftChild){
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
        } else if (current.getLeftChild() == null){
            if (current == root){
                root = current.getRightChild();
            } else if (isLeftChild){
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
        }
    }

    public Integer smallest (){
        if (this.root != null){
            return root.smallest();
        }
        return null;
    }

    public Integer largest (){
        if (this.root != null){
            return  root.largest();
        }
        return null;
    }

    public static void main(String[] args) {
        int[] sample = { 212, 580, 6, 5, 7, 28, 26, 84, 112, 434};
        BinarySearchTree bst = new BinarySearchTree();
        for (int x : sample) {
            bst.insert(x);
        }
        System.out.println(bst.find(40));
        System.out.println(bst.smallest());
        System.out.println(bst.largest());
//		bst.delete(84);
        /*System.out.println(bst.numOfLeafNodes());
        System.out.println(bst.height());*/
        bst.traverseInOrder();
        bst.traversePreOrder();
        bst.traversePostOrder();
    }
}
