package Assignment7;

import java.util.Scanner;

public class A7Q2 {
    static class Node {
        int info;
        Node next;

        Node(int info, Node next) {
            this.info = info;
            this.next = next;
        }
    }
    static Scanner sc = new Scanner(System.in);
    static Node front = null, rear = null;

    public static void insert() {
        System.out.println("Enter integer to insert into the queue: ");
        Node newNode = new Node(sc.nextInt(), null);
        if(rear == null)
            front = newNode;
        else
            rear.next = newNode;
        rear = newNode;
        System.out.println(newNode.info + " inserted into the queue.");
    }

    public static void delete() {
        if(front == null)
            System.out.println("Unable to delete element from the queue - queue is empty!");
        else {
            System.out.println("Deleting " + front.info + " from the queue.");
            if(front == rear)
                front = rear = null;
            else
                front = front.next;
        }
    }

    public static void display() {
        if(front == null)
            System.out.println("Unable to display queue elements - queue is empty!");
        else {
            System.out.println("Elements of the queue: ");
            Node temp = front;
            while(temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice) {
                case 0:
                    System.exit(0);
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

