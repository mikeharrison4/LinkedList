package com.company;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    int counter = 0;

    public String getFirst() {
        return head.value;
    }

    public String getLast() {
        return head.getLast().value;
    }

    public void add(String value) {
        if(head == null) {
            head = new Node(value);
        } else {
            head.getLast().nextNode = new Node(value);
        }
        counter++;
    }

    public boolean isValueInList(String value) {
        boolean bFound = false;
        Node checkNode = head;
        while(!bFound && checkNode.value != null) {
            if (checkNode.value.equals(value)) {
                bFound = true;
            } else {
                checkNode = checkNode.nextNode;
                if(checkNode == null) break;
            }
        }
        return bFound;
    }

    public void removeValue(int index) {
        boolean bFound = false;
        Node checkNode = head;
        Node previousNode = null;
        int currentIndex = 0;

        while(!bFound) {
            if(index == currentIndex) {
                bFound = true;
                if(previousNode != null) {
                    previousNode.nextNode = checkNode.nextNode;
                } else {
                    head = head.nextNode;
                }
                counter--;
            } else {
                previousNode = checkNode;
                checkNode = checkNode.nextNode;
            }
            currentIndex++;
        }
    }

    public String printArray() {
        String[] arr = new String[counter];
        int index = 0;
        Node checkNode = head;

        while(index < counter) {
            arr[index] = checkNode.value;
            checkNode = checkNode.nextNode;
            index++;
        }

        return Arrays.toString(arr);
    }


}

class Node {
    String value;
    Node nextNode;

    public Node(String value) {
        this.value = value;
    }

    Node getLast() {
        if(nextNode == null) {
            return this;
        }
        return nextNode.getLast();
    }
}
