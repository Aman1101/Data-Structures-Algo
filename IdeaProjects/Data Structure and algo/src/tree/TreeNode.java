package tree;

public class TreeNode {

    Integer data;
    public TreeNode leftChild, rightChild;

    public TreeNode(Integer data){
        this.data = data;
    }

    public Integer smallest (){
        if(this.leftChild == null){
            return this.data;
        }
        return this.leftChild.smallest();
    }
    public Integer largest (){
        if (this.rightChild == null){
            return this.data;
        }
        return this.rightChild.largest();
    }

    public TreeNode find (Integer data){

        if(this.data == data){
            return this;
        } else if(this.data > data && leftChild != null){
            return leftChild.find(data);
        }else if (this.data < data && rightChild != null){
            return rightChild.find(data);
        }
        return null;
    }

    public void insert(Integer data){
        if(data >= this.data){
            if(this.rightChild == null){
                this.rightChild = new TreeNode(data);
            }else{
                this.rightChild.insert(data);
            }
        } else if (this.leftChild == null) {
            this.leftChild = new TreeNode(data);
        } else {
            this.leftChild.insert(data);
        }
    }

    public void traverseInOrder(){
        if (this.leftChild != null)
            this.leftChild.traverseInOrder();
        System.out.println(this + " ");
        if (this.rightChild != null)
            this.rightChild.traverseInOrder();
    }

    public void traversePreOrder(){
        System.out.println(this + " ");
        if (this.leftChild != null)
            this.leftChild.traversePreOrder();
        if (this.rightChild != null)
            this.rightChild.traversePreOrder();
    }

    public void traversePostOrder(){
        if (this.leftChild != null)
            this.leftChild.traversePostOrder();
        if (this.rightChild != null)
            this.rightChild.traversePostOrder();
        System.out.println(this + " ");
    }
    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
