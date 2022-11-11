package LinkedList;

public class LinkedListInsert {
    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static LinkedListInsert insert(LinkedListInsert list, int data) {

        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    public static void printList(LinkedListInsert list) {
        Node currentNode = list.head;
        System.out.println("LinkedList : ");

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static LinkedListInsert deletAtPosition(LinkedListInsert list, int index) {
        Node currentNode = list.head, prev = null;

        if (index == 0 && currentNode != null) {
            list.head = currentNode.next;
            System.out.println(index + " position element  deleted");
            return list;
        }
        int counter = 0;
        while (currentNode != null) {
            if (counter == index) {
                prev.next = currentNode.next;
                System.out.println(index + " position element deleted");
                break;
            } else {
                prev = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }
        if(currentNode ==null){
            System.out.println(index + " position element not found");
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedListInsert list = new LinkedListInsert();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        printList(list);
        deletAtPosition(list, 0);
        printList(list);
        deletAtPosition(list, 2);
        printList(list);
        deletAtPosition(list, 10);

    }

}
