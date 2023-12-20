class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Lstack1 {
    public static LinkedList mergeAlternate(LinkedList list1, LinkedList list2) {
        LinkedList result = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null || current2 != null) {
            if (current1 != null) {
                result.append(current1.data);
                current1 = current1.next;
            }
            if (current2 != null) {
                result.append(current2.data);
                current2 = current2.next;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Populate the first linked list
        list1.append(10);
        list1.append(20);
        list1.append(30);
        list1.append(40);
        list1.append(50);

        // Populate the second linked list
        list2.append(90);
        list2.append(100);
        list2.append(200);
        list2.append(300);

        LinkedList result = mergeAlternate(list1, list2);

        System.out.println("List 1:");
        list1.display();

        System.out.println("List 2:");
        list2.display();

        System.out.println("Resultant list:");
        result.display();
    }
}