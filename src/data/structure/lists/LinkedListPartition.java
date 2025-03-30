package data.structure.lists;

import java.util.HashSet;
import java.util.Set;

public class LinkedListPartition {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListPartition(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void partitionList(int x){
        Node current = head;
        Node lastSmall = null;
        Node firstBig = null;
        Node lastBig = null;
        while(current!=null){
            System.out.println("Current ="+ current.value);
            if(current.value <x) {
                if(lastSmall == null)
                    lastSmall = current;//latest small element initialize
                else{
                    lastSmall.next = current; //3->2
                    //current.next = firstBig;
                    lastSmall = current;//lastSmall pointer to current

                }

            }
            if(current.value>= x && firstBig ==null){
                firstBig = current;
                lastBig = current;
            }
            else if(current.value>= x && firstBig !=null){
                lastBig = current;
            }

            current = current.next;
        }

        if(firstBig!=null && lastSmall!=null)
            lastSmall.next = firstBig;
        if(lastBig!=null)
            lastBig.next = null;
    }

    public void removeDuplicates(){

        Set<Integer> numSet = new HashSet<>();
        Node current = head;
        Node prev = head;
        StringBuilder s = new StringBuilder();
        int[] a =  new int[]{1, 2};
        while(current!=null){
            if(!numSet.add(current.value)){
                prev.next = current.next;
            }else{
                prev = current;
            }
            current = current.next;
            printList();
        }
    }
}
