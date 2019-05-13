package linked_list;

public class DoublyLinkedNode {
    private Integer data;
    private DoublyLinkedNode prevNode;
    private DoublyLinkedNode nextNode;

    public DoublyLinkedNode(Integer data){
        this.data=data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public DoublyLinkedNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoublyLinkedNode prevNode) {
        this.prevNode = prevNode;
    }

    public DoublyLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
