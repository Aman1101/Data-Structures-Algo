package linked_list;

public class DoublyLinkedListDemo {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtHead(3);
        list.insertAtHead(5);
        list.insertAtHead(2);
        list.insertAtHead(6);
        list.insertAtHead(3);
        list.insertAtHead(5);
        list.insertAtHead(7);
        list.insertAtHead(9);

        System.out.println(list);

    }
}
