package neetcode.core.skills;

import java.util.ArrayList;

class SinglyLinkedList {
    ListNode head;
    ListNode tail;

    public SinglyLinkedList() {
        this.head = new ListNode(-1);
        this.tail = head;
    }

    public int get(int index) {
        int counter = 0;
        ListNode current = head.next;
        while (current != null) {
            if (counter == index) {
                return current.val;
            }
            counter++;
            current = current.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        ListNode curr = this.head;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }

        if (curr != null && curr.next != null) {
            if (curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<Integer>();
        ListNode current = head.next;
        while (current != null) {
            res.add(current.val);
            current = current.next;
        }
        return res;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertHead(10);
        list.insertTail(20);
        list.insertHead(5);
        list.insertTail(30);

        System.out.println("List values: " + list.getValues());

        list.remove(2); // Remove element at index 2

        System.out.println("After removal: " + list.getValues());

        int value = list.get(1);
        System.out.println("Value at index 1: " + value);
    }
}

