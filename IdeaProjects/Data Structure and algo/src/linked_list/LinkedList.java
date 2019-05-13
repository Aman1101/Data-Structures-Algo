package linked_list;

public class LinkedList {
    private Node head;
    private Node tail;

    public void insertAtHead(int data){
        Node newNode= new Node(data);
        newNode.setNextNode(this.head);
        this.head=newNode;
    }

    public void insertAndSort(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            if (tail.getData() <= newNode.getData()) {
                tail.setNextNode(newNode);
                tail = newNode;
            } else {

                if (this.head.getData() > newNode.getData()) {
                    newNode.setNextNode(this.head);
                    this.head = newNode;
                } else {
                    Node current = this.head;
                    while (current != null) {
                        if (current.getNextNode().getData() > newNode.getData()) {
                            newNode.setNextNode(current.getNextNode());
                            current.setNextNode(newNode);
                            break;
                        }
                        current = current.getNextNode();
                    }
                }
            }
        }
    }

    public int length(){
        int length = 0;
        Node current = this.head;

        while (current != null){
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    public void deleteFromHead (){
        this.head = this.head.getNextNode();
    }

    public Node find(int data){
        Node current = this.head;

        while (current != null){
            if(current.getData()==data){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    public void insertInSortedList(int data){
        Node newNode = new Node(data);
        Node current = this.head;
        while(current != null) {
            if (current.getData()>=data){

            }
        }
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current.getNextNode() != null){
            result += current.toString() + ", ";
            current = current.getNextNode();
        }
        result +=tail.toString()+ "}";
        return result;
    }
}
