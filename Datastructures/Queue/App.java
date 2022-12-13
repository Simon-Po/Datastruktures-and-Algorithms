package Datastructures.Queue;

public class App {
    public static void main(String[] args) {
        

        Queue q = new Queue(2);

        q.Enqueue(10);
        q.Enqueue(400);
        System.out.println(q.Dequeue());
        q.Enqueue(20);
        q.Dequeue();
        System.out.println(q.Peek());


    }
}
