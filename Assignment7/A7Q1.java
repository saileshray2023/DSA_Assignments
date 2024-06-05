package Assignment7;

import java.util.Scanner;

public class A7Q1 {
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;
    static Scanner sc = new Scanner(System.in);

    public static boolean is_full(int q[]) {
        return (rear + 1) % q.length == front;
    }
    public static boolean is_empty(int q[]) {
        return front == -1;
    }

    public static void insert(int q[]) {
        if(is_full(q))
            System.out.println("Unable to insert element into the queue - queue is full!");
        else {
            System.out.println("Enter integer to insert into the queue: ");
            rear = (rear + 1) % q.length;
            q[rear] = sc.nextInt();
            if(front == -1)
                front = 0;
            System.out.println(q[rear] + " inserted into the queue.");
        }
    }

    public static void delete(int q[]) {
        if(is_empty(q))
            System.out.println("Unable to delete element from the queue - queue is empty!");
        else {
            System.out.println("Deleting " + q[front] + " from queue.");
            if(front == rear)
                front = rear = -1;
            else
                front = (front + 1) % q.length;
        }
    }

    public static void display(int q[]) {
        if(is_empty(q))
            System.out.println("Unable to display queue elements - queue is empty!");
        else {
            int temp = front;
            System.out.println("Elements of the queue: ");
            while(temp != rear) {
                System.out.print(q[temp] + " ");
                temp = (temp + 1) % q.length;
            }
            System.out.println(q[temp]);
        }
    }


    public static void main(String args[]) {
        int queue[] = new int[MAX];

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
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
