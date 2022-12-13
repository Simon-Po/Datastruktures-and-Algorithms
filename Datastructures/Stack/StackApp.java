package Datastructures.Stack;


public class StackApp {
    public static void main(String[] args) {
        Stack s = new Stack(10);
        
        s.Push(2);
        System.out.println(String.valueOf(s.Peek()));
        s.Push(5);
        System.out.println(String.valueOf(s.Peek()));
        s.Push(293);
        System.out.println(String.valueOf(s.Peek()));
        s.Push(88);
        System.out.println(String.valueOf(s.Peek()));
        s.Push(50);
        System.out.println(String.valueOf(s.Peek()));
        s.Pop();
        System.out.println(String.valueOf(s.Peek()));
        s.print();
    }   
}
