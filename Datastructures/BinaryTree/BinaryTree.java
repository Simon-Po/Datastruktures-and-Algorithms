package Datastructures.BinaryTree;

public class BinaryTree {
    Node root;
   

    public BinaryTree() {
        
        
    }

    private Node addRecursive(Node current, int data) {
        if(current == null) {
            return new Node(data);
        }
        if(data < current.getData()){
            current.left = addRecursive(current.left, data);
        }else if (data > current.getData()){
            current.right = addRecursive(current.right, data);
        }else {
            return current;
        }

        return current;
    }

    public void add(int data){
        this.root = addRecursive(this.root, data);
    }

    public void addMultiple(int[] dataArr) {
        for (int i = 0; i < dataArr.length; i++) {
            this.root = addRecursive(this.root,dataArr[i]);
        }
    }

    
    public boolean containsNode(int data){
        return containsNodeRecursive(root,data);
    }


    private boolean containsNodeRecursive(Node current,int data){
        if (current == null) {
            return false;
        } 
        if (data == current.getData()){
            return true;
        }
        return data < current.getData() ? containsNodeRecursive(current.left, data) : containsNodeRecursive(current.right, data);
    }

    

   
    
   
}
