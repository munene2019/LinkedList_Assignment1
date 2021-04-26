/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinglyLinkedList;

/**
 *
 * @author Rogers
 */
//Node Type=It is a element package  that holds all data values of a data structure asscociated to it.eg LinkedList  type Node holds the data values  of the node(Node value and the pointer to next node value)
public class Main {

    public static void main(String args[]) {

        LinkNodes();
    }

    public static void LinkNodes() {
        Node ten;
        Node seven;
        Node six;
        Node twenty;
        //Assigning Values
        ten = new Node(10);
        seven = new Node(7);
        six = new Node(6);
        twenty = new Node(20);
        //Linking process
        ten.next = seven;
        seven.next = six;
        six.next = twenty;
        twenty.next = null;

        System.out.println("Ten  " + ten.data + "\n" + "Seven " + ten.next.data + "\n" + "Six " + seven.next.data + "\n" + "Twenty " + six.next.data);
        System.out.println("nodes" + ten.next.next.next.data);
        

    }

}
