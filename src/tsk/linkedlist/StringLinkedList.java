package tsk.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class StringLinkedList <T>{

    private Node first = null;
    private long size = 0;

    public void add(Node node) {
        node.setNext(first);
        first = node;
        node.setId(size);
        size++;
    }

    public Node next() {
        return new Node("String");
    }

    public boolean hasNext(Node node) {
        return node!=null;
    }

    public long size() {
        return size;
    }

    public Node get(int id) {
        if (id < 0 || id > size) {
            throw new IndexOutOfBoundsException();
        }

        Node result = first;

        if (id!=0) {
            int counter = 1;
            while (counter<id){
                result = result.getNext();
            }
        }



        return result;
    }

    public void print() {
        printList(first);
    }

    private void printList(Node<String> node) {
        if(hasNext(node)) {
            printList((node.getNext()));
            System.out.println("Node is " + node.getValue());
        }
    }

    public static void main(String[] args) {

        StringLinkedList<String> list = new StringLinkedList();
        list.add(new Node("abc"));
        list.add(new Node("def"));
        list.add(new Node("get"));

        list.print();

        System.out.println(list.size());
        System.out.println(list.get(1).getValue());

        //TO-DO
        //przerobić na generics
        //odwrócić kolejność dodawania
    }
}