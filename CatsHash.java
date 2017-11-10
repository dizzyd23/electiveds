package Tanaka;

import Tanaka.Cats;

public class CatsHash {

    private static class Node {
        private Cats data;
        private Node nextLink;

        public Node(Cats data, Node next) {
            this.data = data;
            this.nextLink = next;
        }

        public Node(Cats data) {
            this.data = data;
            this.nextLink = null;
        }
    }

    private Node head;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }



    public void addAtHead(Cats data) {
        head = new Node(data, head);
        size++;
    }

    public void addToTail(Cats data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (head == null)
            head = newNode;

        while (curr.nextLink != null) {
            curr = curr.nextLink;
        }
        curr.nextLink = newNode;

    }


    Node InsertNth(Cats data, int position) {
        Node node = head;
        if (position == 0) {
            node = new Node(data, head);
            return node;
        } else {
            while (--position > 0) {
                node = node.nextLink;
            }
            Node next = node.nextLink;
            node.nextLink = new Node(data, next);
            return head;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getName() + ", " + temp.data.getCatsNumber() + ", ");
            temp = temp.nextLink;
        }
    }

}
