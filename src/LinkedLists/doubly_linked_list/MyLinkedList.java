import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {
		StudentDoublyLinkedList linkedList = new StudentDoublyLinkedList();
        System.out.println(linkedList.isEmpty());

        linkedList.printList();
        linkedList.prepend(18, "Donia");
		linkedList.prepend(20, "Jihen");
		linkedList.prepend(14, "Marwa");//sry not sry xD
        linkedList.prepend(19, "Islem");
        System.out.println(linkedList.getSize());
        linkedList.printList();

        linkedList.append(19, "Hanin");
        System.out.println(linkedList.getSize());
        linkedList.printList();

        linkedList.removeFromHead();
		System.out.println(linkedList.getSize());
        linkedList.printList();
        

        linkedList.removeFromTail();
		System.out.println(linkedList.getSize());
		linkedList.printList();

    }
}
