package linked_list;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        /*list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);*/

        list.insertAndSort(6);
        list.insertAndSort(4);
        list.insertAndSort(2);
        list.insertAndSort(9);
        list.insertAndSort(5);
        list.insertAndSort(8);
        list.insertAndSort(1);
        list.insertAndSort(5);
        list.insertAndSort(10);
        list.insertAndSort(11);
        list.insertAndSort(12);
        list.insertAndSort(5);
        list.insertAndSort(11);
        list.insertAndSort(12);
        list.insertAndSort(14);
        list.insertAndSort(22);
        list.insertAndSort(44);
        list.insertAndSort(55);
        list.insertAndSort(66);
        list.insertAndSort(77);
        list.insertAndSort(88);
        list.insertAndSort(100);
        list.insertAndSort(111);
        list.insertAndSort(121);
        list.insertAndSort(131);


//        list.deleteFromHead();

        System.out.println(list);
        System.out.println("Length : " + list.length());
//        System.out.println("Found : " + list.find(19));

    }
}
