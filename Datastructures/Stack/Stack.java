package Datastructures.Stack;

public class Stack {
    private Integer[] internalStack;
    private int top = 0;
    private int size;
    public Stack(int size) {
        this.internalStack = new Integer[size];
        this.size = size;



    }

    public void Push(Integer element) {
        
        if (!isFull()) {
        this.internalStack[++top] = element;
        } else {
            System.out.println("Stack is full");
        }
    }

    public int Pop() {
        
        return (!isEmpty()) ? this.internalStack[top--] : 0;
    }

    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return true;
        }
    }

    public boolean isFull() {
        if(this.top == this.size- 1){
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        for(int i = 0; i <= top; i++) {
            System.out.println(internalStack[i]);
        }
    }





    public int Peek() {
        return this.internalStack[top];
    }



}