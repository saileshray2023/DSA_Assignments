package SinglyLinkedLIst;

import java.util.Scanner;

public class Practise {
    static class Node {
        protected int data;
        protected Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    static Scanner sc = new Scanner(System.in);

    public static Node create(Node start) {
        Node l = null;
        do {

            System.out.println("Enter data of Node");
            int data = sc.nextInt();
            Node n = new Node(data, null);
            if (start == null) {
                start = n;
            } else l.next = n;
            l = n;
            System.out.println("Want to add more nodesY/N?");

        } while (sc.next().charAt(0) == 'Y');

        return start;
    }

    public static void display(Node start) {
        if (start == null)
            System.out.println("List is empty");
        else {
            Node temp = start;
            System.out.println("Elements of list: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static Node insBeg(Node start){
        Node temp=start;
        System.out.println("Enter data of the node");
        Node n=new Node(sc.nextInt(), start);
        start=n;
        System.out.println("Information added");
        return start;
    }

    public static void main(String[] args) {
        Node start = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Enter choice
                     0 Create 
                     1 Display
                     2 Exit
                     3 Insert at beg
                     """);

            switch (sc.nextInt()) {
                case 0 -> start = create(start);
                case 1 -> display(start);
                case 2 -> System.exit(0);
                case 3->start=insBeg(start);
                default -> System.out.println("Invalid choice");
            }


        }
    }
}
