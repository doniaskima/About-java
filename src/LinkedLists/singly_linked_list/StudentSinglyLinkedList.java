

public class StudentSinglyLinkedList {
    private StudentNode head;
    private int size;
    
    public void prepend(int grade, String name) {
        StudentNode node = new StudentNode(grade, name);
        node.setNext(head);
        head = node;
        size++;
    }

    public StudentNode removeFromHead() {
        if (isEmpty()) {
            return null;
        }

        StudentNode removeNode = head;
        head = head.getNext();
        siz--;
        removeNode.setNext(null);
        return removeNode;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        StudentNode current = node;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.println(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
