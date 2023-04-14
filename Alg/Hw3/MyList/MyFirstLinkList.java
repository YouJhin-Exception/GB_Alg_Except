package Alg.Hw3.MyList;

import Alg.Hw3.Interfaces.MyListAdd;
import Alg.Hw3.Interfaces.MyListAddFirst;
import Alg.Hw3.Interfaces.MyListDelete;
import Alg.Hw3.Interfaces.MyListReverse;

public class MyFirstLinkList implements MyListAddFirst, MyListDelete, MyListReverse, MyListAdd {
    Node head;
    Node tail;


    @Override
    public void myAddFirst(Object item) {
        Node node = new Node();
        node.value = item;
        if (head != null) {
            node.next = head;
            head.previous = node;
        } else {
            tail = node;
        }
        head = node;
    }

    @Override
    public void myListAdd(Object item) {
        Node node = new Node();
        node.value = item;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    @Override
    public void myDelete(Object item) {
        Node current = head;
        while (current != null) {
            if (current.value == item) {
                if (current.previous == null) {
                    current.next.previous = null;
                    head = current.next;
                } else {
                    if (current.next == null) {
                        current.previous.next = null;
                        tail = current.previous;
                    } else {
                        current.previous.next = current.next;
                        current.next.previous = current.previous;
                    }
                }
            }
            current = current.next;
        }
    }

    @Override
    public void reverse() {
        Node current = head;
        while (current != null) {
            Node next = current.next;
            Node previos = current.previous;
            current.next = previos;
            current.previous = next;
            if (previos == null) {
                tail = current;
            }
            if (next == null) {
                head = current;
            }
            current = next;
        }

    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println();
    }


    // код с семинара () myAddFirst - тоже
    // остальное лень )) т.к. долго с удалением по значению провозился (хотя кому оно надо...) но было интересно ))

//    public void removeFirst() {
//        if (head != null && head.next != null) {
//            head.next.prev = null;
//            head = head.next;
//        } else {
//            head = null;
//            tail = null;
//        }
//    }
//
//    public void addLast(int value) {
//        Node node = new Node();
//        node.value = value;
//        if (tail != null) {
//            node.prev = tail;
//            tail.next = node;
//        } else {
//            head = node;
//        }
//        tail = node;
//    }
//
//    public void removeLast() {
//        if (tail != null && tail.prev != null) {
//            tail.prev.next = null;
//            tail = tail.prev;
//        } else {
//            head = null;
//            tail = null;
//        }
//    }

}
