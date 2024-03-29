package linked_list;

public class DoublyLinkedList {

    private DoublyLinkedNode head;

   /* public void insertAtHead(int data){
        DoublyLinkedNode newNode  = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);

        if(this.head != null){
            this.head.setPrevNode(newNode);
        }
        this.head = newNode;
    }*/

    public void insertAtHead(Integer data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);
        if (this.head != null) {
            this.head.setPrevNode(newNode);
        }
        this.head = newNode;
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int length = 0;
        DoublyLinkedNode current = this.head;

        while (current != null){
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoublyLinkedNode n = this.head;
        while (n != null) {
            sb.append("Node data: ");
            sb.append(n);
            sb.append("\n");
            n = n.getNextNode();
        }
        return sb.toString();
    }
}

