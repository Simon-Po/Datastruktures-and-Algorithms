package Datastructures.LinkedList;

public class App {
    public static void main(String[] args) {
       LL l = new LL();

       l.insert(l, 22);
       l.insert(l, 3456);
       l.insert(l, 345);
       l.insert(l, 4567);
       l.insert(l, 93);
       l.insert(l, 02);
       l.insert(l, 858);
       l.insert(l, 884);
       l.insert(l, 29);
       l.insert(l, 488);
        

       l.deleteByKey(l, 93);

        l.deleteByPosition(l, l.length-1);

       l.printList(l);
       
    }
}
