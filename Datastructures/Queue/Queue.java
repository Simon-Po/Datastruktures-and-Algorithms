package Datastructures.Queue;

public class Queue {
    private Integer[] arr;
    private int size;
    private int front = 0;
    private int back = 0;

    public Queue(int size) {
        this.size = size;
        this.arr = new Integer[size];
    }

    public void Enqueue(int i) {
        if(!isFull()){
            this.arr[++front] = i;
        } else {
            System.out.println("Queue is Full");
        }
    }

    public String Dequeue() {
        if(!isEmpty()) {
            return String.valueOf(arr[this.front--]);
        } else {
            return "Stack is empty";
        }
    }

    public boolean isEmpty() {
        if (this.front == this.back){
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if (this.front == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public String Peek() {
        return String.valueOf(this.arr[front]);
    }
}
