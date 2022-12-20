package Datastructures.BinaryTree;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        Random r = new Random();
        int[] arr = new int[200];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(0,200);
        }
        b.addMultiple(arr);

        if(b.containsNode(100)){
            System.out.println("100 contained");
        } else {
            System.out.println("does not contain 100");
        }
    }   
    
}