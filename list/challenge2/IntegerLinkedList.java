package list.challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
        // add your code here
        if (size > 0) {
            if (value <= head.getValue()) {
                addToFront(value);
            } else {
                IntegerNode checkNode = head;
                IntegerNode newNode = new IntegerNode(value);
            while (checkNode.getValue() != null) {
                    if (checkNode.getNext() == null) {
                        checkNode.setNext(newNode);
                        break;
                    }
                    if (checkNode.getNext().getValue() >= value) {
                        newNode.setNext(checkNode.getNext());
                        checkNode.setNext(newNode);
                        break;
                    } else {
                        checkNode = checkNode.getNext();
                    }
                }
            size++;
            }
        } else {
            head = new IntegerNode(value);
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
