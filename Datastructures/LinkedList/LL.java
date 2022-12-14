package Datastructures.LinkedList;


public class LL {
    private Node head; // head of list
    public int length;
    public LL insert(LL list, int data){
        Node newNode = new Node(data);



        if (list.getHead() == null) {
            list.head = newNode;
            
        } else {
            Node last = list.head;
            while(last.next != null) {
                last = last.next;
            }

            last.next = newNode;
            length++;
        }
        return list;


        
        
    }
    
        public void printList(LL list) {
            Node currNode = list.head;

            System.out.println("LinkedList: ");
            int c = 0;
            while (currNode != null) {
                System.out.println(c + ": "+  currNode.data + " ");

                currNode = currNode.next;
                c ++;
            }
        }



        public LL deleteByKey(LL list, int key) {


            Node currNode = list.head, prev = null;
            

            if(currNode != null && currNode.data == key) {
                list.head = currNode.next;
                System.out.println(key + " found and deleted");
                return list;

            }

            while (currNode != null && currNode.data != key) {
                prev = currNode;
                currNode = currNode.next;
            }

            if (currNode != null) {
                prev.next = currNode.next;
                System.out.println(key + " found and deleted!");
            }


            if (currNode == null) {
                System.out.println(key + " not found");
            }

            return list;


        }
        public LL deleteByPosition(LL list, int index) {


            Node currNode = list.head, prev = null;
            

            if(currNode != null && index == 0) {
                list.head = currNode.next;
                System.out.println(index + " found and deleted");
                return list;

            }

            int counter = 0;

            while (currNode != null && counter != index) {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }

            if (currNode != null && index == counter) {
                prev.next = currNode.next;
                System.out.println(index + " found and deleted!");
            }


            if (currNode == null) {
                System.out.println(index + " not found");
            }

            return list;


        }
    
    public Node getHead() {
        return head;
    }





}