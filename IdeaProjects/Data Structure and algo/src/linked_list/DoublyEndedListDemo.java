package linked_list;

public class DoublyEndedListDemo {

    public static void main(String[] args) {
        DoublyEndedList list = new DoublyEndedList();

        list.insertAtTail(12);
        list.insertAtTail(13);
        list.insertAtTail(14);
        list.insertAtTail(15);
        list.insertAtTail(16);
        list.insertAtTail(17);
        list.insertAtTail(18);
        list.insertAtTail(19);

        System.out.println(list);
    }
}
