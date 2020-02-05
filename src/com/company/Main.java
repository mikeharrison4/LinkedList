package com.company;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myList = new MyLinkedList();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");

        System.out.println(myList.getLast());
        myList.removeValue(5);
        System.out.println(myList.getLast());

        System.out.println(myList.printArray());

    }

}