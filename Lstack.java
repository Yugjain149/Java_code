import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(data + " pushed onto the stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value for an empty stack
        }
        int poppedItem = head.data;
        head = head.next;
        System.out.println("Popped: " + poppedItem);
        return poppedItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1; // Return a sentinel value for an empty stack
        }
        System.out.println("Peeked: " + head.data);
        return head.data;
    }

    public void display() {
        Node current = head;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Lstack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackLinkedList stack = new StackLinkedList();

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to push: ");
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}