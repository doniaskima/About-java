import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {
		StudentDoublyLinkedList linkedList = new StudentDoublyLinkedList();
        System.out.println(linkedList.isEmpty());

        linkedList.printList();
        linkedList.prepend(18, "Donia");
		linkedList.prepend(20, "Jihen");
		linkedList.prepend(17, "Marwa");
        linkedList.prepend(19, "Islem");
        System.out.println(linkedList.getSize());
        linkedList.printList();
    }
}
