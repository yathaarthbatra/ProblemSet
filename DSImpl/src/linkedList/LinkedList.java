package DSImpl.src.linkedList;

public class LinkedList {

    private Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    //insert the node at the starting of the linkedList
    public void push(int data){
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
    }

    //insert the node at the end of the linked list
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        //traversing to the end of linkedlist
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printTheLinkedList(){
        if(head == null){
            System.out.println("No linkedList present");
            return;
        }

        Node node = head;
        while (node != null){
            System.out.println("node " + node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList obj1 = new LinkedList();
        obj1.append(5);
        obj1.append(6);
        obj1.append(7);
        obj1.push(1);
        obj1.append(10);
        obj1.printTheLinkedList();
    }
}
