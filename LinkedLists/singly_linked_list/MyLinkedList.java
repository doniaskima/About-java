public class MyLinkedList{

	public static void main(String[] args) {
		StudentSinglyLinkedList linkedList = new StudentSinglyLinkedList();
		System.out.println(linkedList.isEmpty());

		linkedList.printList();
		linkedList.prepend(99, "Donia");
		linkedList.prepend(88, "Jihen");
		linkedList.prepend(77, "Marwa");
		linkedList.prepend(55, "Islem");

		System.out.println(linkedList.getSize());

		linkedList.printList();
		linkedList.removeFromHead();
		System.out.println(linkedList.getSize());
		linkedList.printList();
	}
}