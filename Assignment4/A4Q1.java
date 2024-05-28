package Assignment4;

import java.util.Scanner;

class A4Q1 {
    static class Node {
        protected int regdNo;
        protected float mark;
        protected Node next;
    }
    static Scanner sc = new Scanner(System.in);

    public static Node create(Node start) {
        Node n = new Node();
        Node l;
        System.out.println("Enter student information: ");
        n.regdNo = sc.nextInt();
        n.mark = sc.nextFloat();
        n.next = null;
        start = n;
        l = n;

        while(true) {
            System.out.println("Do you want to create more nodes (y/n): ");
            char ch = sc.next().charAt(0);

            if(ch != 'y' && ch != 'Y')
                break;

            n = new Node();
            System.out.println("Enter student information: ");
            n.regdNo = sc.nextInt();
            n.mark = sc.nextFloat();
            n.next = null;
            l.next = n;
            l = n;
        }
        return start;
    }

    public static Node insBeg(Node start) {
        Node n = new Node();
        System.out.println("Enter student information: ");
        n.regdNo = sc.nextInt();
        n.mark = sc.nextFloat();
        n.next = start;
        start = n;
        System.out.println("New student information inserted at the beginning of list.");
        return start;
    }

    public static Node insEnd(Node start) {
        Node n = new Node();
        System.out.println("Enter student information: ");
        n.regdNo = sc.nextInt();
        n.mark = sc.nextFloat();
        n.next = null;

        if(start == null)
            start = n;
        else {
            Node temp = start;
            while(temp.next != null)
                temp = temp.next;

            temp.next = n;
        }

        System.out.println("New student information inserted at the end of list.");
        return start;
    }

    public static Node insAny(Node start) {
        System.out.println("Enter position to insert at: ");
        int position = sc.nextInt();

        if(position <= 0 || position > count(start) + 1)
            System.out.println("Unable to insert node - invalid position!");
        else if(position == 1)
            return insBeg(start);
        else if(position == count(start) + 1)
            return insEnd(start);
        else {
            Node n = new Node(), t = start;
            System.out.println("Enter student information: ");
            n.regdNo = sc.nextInt();
            n.mark = sc.nextFloat();

            for(int i = 0; i < position - 2; i++)
                t = t.next;
            n.next = t.next;
            t.next = n;
        }
        return start;
    }

    public static Node delBeg(Node start) {
        if(start == null)
            System.out.println("Unable to remove node - list is empty!");
        else {
            Node t = start;
            start = start.next;
            t.next = null;
            System.out.println("Removing from list, student with registration number: " + t.regdNo + " and marks: " + t.mark);
        }
        return start;
    }

    public static Node delEnd(Node start) {
        if(start == null)
            System.out.println("Unable to remove node - list is empty!");
        else {
            Node t = start, d;
            if(start.next == null) {
                d = start;
                start = null;
            }
            else {
                while(t.next.next != null)
                    t = t.next;
                d = t.next;
                t.next = null;
            }
            System.out.println("Removing from list, student with registration number: " + d.regdNo + " and marks: " + d.mark);
        }
        return start;
    }

    public static Node delAny(Node start) {
        if(start == null) {
            System.out.println("Unable to remove node - list is empty!");
            return start;
        }

        System.out.println("Enter position to delete node from: ");
        int position = sc.nextInt();

        if(position <= 0 || position > count(start)) {
            System.out.println("Unable to remove node - invalid position!");
            return start;
        }

        Node t = start, d;

        if(position == 1)
            return delBeg(start);

        if(position == count(start))
            return delEnd(start);

        for(int i = 0; i < position - 2; i++)
            t = t.next;

        d = t.next;
        t.next = d.next;
        d.next = null;

        System.out.println("Removing from list, student with registration number: " + d.regdNo + " and marks: " + d.mark);

        return start;
    }

    public static Node delRegdNo(Node start) {
        if(start == null) {
            System.out.println("Unable to remove node - list is empty!");
            return start;
        }

        System.out.println("Enter registration number of student to delete from list: ");
        int r = sc.nextInt();

        Node t = start, d;

        if(t.regdNo == r) {
            d = t;
            start = start.next;
            d.next = null;
            System.out.println("Removing from list, student with registration number: " + d.regdNo + " and marks: " + d.mark);
        }
        else {
            boolean found = false;
            while(t.next != null) {
                if(t.next.regdNo == r) {
                    found = true;
                    d = t.next;
                    t.next = d.next;
                    d.next = null;
                    System.out.println("Removing from list, student with registration number: " + d.regdNo + " and marks: " + d.mark);
                    break;
                }
                t = t.next;
            }
            if(!found)
                System.out.println("Unable to remove node - student with registration number " + r + " does not exist in list!");
        }
        return start;
    }

    public static void search(Node start) {
        if(start == null) {
            System.out.println("Unable to update student mark - list is empty!");
            return;
        }

        System.out.println("Enter registration number of student to update mark: ");
        int r = sc.nextInt();

        Node t = start;

        boolean found = false;
        while(t != null) {
            if(t.regdNo == r) {
                found = true;
                System.out.println("Enter the updated mark of student " + t.regdNo + ": ");
                t.mark = sc.nextFloat();
                System.out.println("Student mark updated");
                break;
            }
            t = t.next;
        }

        if(!found)
            System.out.println("Unable to update student mark - student with registration number " + r + " not found in list!");
    }

    public static void sort(Node start) {
        if(start != null && start.next != null) {
            Node f, s;
            int tempInt;
            float tempFloat;

            for(int i = 0; i < count(start) - 1; i++) {
                f = start;
                s = start.next;

                for(int j = 0; j < count(start) - i - 1; j++) {
                    if(f.mark > s.mark) {
                        tempInt = f.regdNo;
                        tempFloat = f.mark;
                        f.regdNo = s.regdNo;
                        f.mark = s.mark;
                        s.regdNo = tempInt;
                        s.mark = tempFloat;
                    }
                    f = f.next;
                    s = s.next;
                }
            }
            System.out.println("List sorted according to student marks.");
        }
        else if(start == null)
            System.out.println("Unable to sort list - list is empty!");
        else
            System.out.println("List contains a single node - trivially sorted.");
    }

    public static int count(Node start) {
        int count = 0;

        Node t = start;
        while(t != null) {
            count++;
            t = t.next;
        }
        return count;
    }

    public static Node reverse(Node start) {
        if(start != null & start.next != null) {
            Node f = null, l = start.next;

            while(l != null) {
                start.next = f;
                f = start;
                start = l;
                l = l.next;
            }
            start.next = f;
            System.out.println("List reversed.");
        }
        else if(start == null)
            System.out.println("Unable to reverse list - list is empty!");
        else
            System.out.println("List contains a single node - trivially reversed.");
        return start;
    }

    public static void display(Node start) {
        if(start == null)
            System.out.println("List is empty");
        else {
            Node temp = start;
            System.out.println("Elements of list: ");
            while(temp != null) {
                System.out.println(temp.regdNo + " " + temp.mark);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Node start = null;
        Scanner sc = new Scanner(System.in);
        int choice;

        while(true)
        {
            System.out.println("\nMenu");
            System.out.println(" 1. Create new linked list");
            System.out.println(" 2. Insert at beginning");
            System.out.println(" 3. Insert at end");
            System.out.println(" 4. Insert at position");
            System.out.println(" 5. Remove from beginning");
            System.out.println(" 6. Remove from end");
            System.out.println(" 7. Remove from position");
            System.out.println(" 8. Remove specific student");
            System.out.println(" 9. Update mark");
            System.out.println("10. Sort list");
            System.out.println("11. Count list size");
            System.out.println("12. Reverse list");
            System.out.println("13. Display list");
            System.out.println("14. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    start = create(start);
                    break;
                case 2:
                    start = insBeg(start);
                    break;
                case 3:
                    start = insEnd(start);
                    break;
                case 4:
                    start = insAny(start);
                    break;
                case 5:
                    start = delBeg(start);
                    break;
                case 6:
                    start = delEnd(start);
                    break;
                case 7:
                    start = delAny(start);
                    break;
                case 8:
                    start = delRegdNo(start);
                    break;
                case 9:
                    search(start);
                    break;
                case 10:
                    sort(start);
                    break;
                case 11:
                    System.out.println("Number of elements in list: " + count(start));
                    break;
                case 12:
                    start = reverse(start);
                    break;
                case 13:
                    display(start);
                    break;
                case 14:
                    System.out.println("Terminating program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
