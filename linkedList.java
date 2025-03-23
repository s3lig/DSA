// Question 3 – Singly Linked List implementation in Java

public class linkedList {

    static class Node {
        int data;
        Node next;

        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    private Node head;

    
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);  
        newNode.next = head;            
        head = newNode;                  
        System.out.println(data + " inserted at the beginning.");
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);   

        if (head == null) {
            head = newNode;             
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;       
            }
            temp.next = newNode;         
        }
        System.out.println(data + " inserted at the end.");
    }

    // Delete a node from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            System.out.println(head.data + " deleted from the beginning.");
            head = head.next;           
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtEnd(25);
        list.display();

        list.deleteFromBeginning();
        list.display();
    }
}
