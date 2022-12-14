package Algorithms.LinearSearch;

public class App {
    public static void main(String[] args) {
        int[] array = {3,4,2,1,7,8,5};
        linearSearch(array, 22);
        
       
    }
    public static int linearSearch(int[] arr, int key){
            int out = -1;
            for (int i = 0; i < arr.length; i++) {
                if(key == arr[i]){
                    out = i;
                }

            }
            System.out.println( (out != -1) ? arr[out] +" is at index: "+ out : key + " Not found");
            return out;
    }
}
