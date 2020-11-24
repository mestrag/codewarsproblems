package Practise;


public class LinkedList {
    static Node head;


    public static class Node {
        int data;
        Node next;

        //constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);

   deleteNodebyKey(list,1);
   printList(list);

    }

    public static LinkedList deleteNodebyKey(LinkedList list, int key) {
        Node currentNode = list.head;
        Node prev = null;
        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            System.out.println(key + "deleted");
        }

        if (currentNode != null) {
            prev.next = currentNode;
            System.out.println(key + "keyfound and deleted");
        }
        if (currentNode == null) {
            System.out.println(key + " not found");
        }
        return list;
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node newnode = new Node(data);
        newnode.next = null;

        if (list.head == null) {
            list.head = newnode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newnode;
        }
        return list;
    }

    //to print linked list
    public static void printList(LinkedList list) {
        Node currNode = list.head;
        while (currNode != null) {
            System.out.println(currNode.data + "");
            currNode = currNode.next;
        }
    }
}
