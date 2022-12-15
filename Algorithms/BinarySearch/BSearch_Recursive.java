package Algorithms.BinarySearch;

import java.util.Random;
import java.util.random.*;
import java.util.Arrays;

public class BSearch_Recursive {
    public static void main(String[] args) {

        int[] arr = new int[100000];
        RandomGenerator r = new Random();
        int target = r.nextInt(0,100000);
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = r.nextInt(0,100000);
            
        }
        Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ",");
        // }
        long startTime = System.nanoTime();
        int out = BinarySeach(arr, target);
        long endTime = System.nanoTime();
        System.out.println("\n" +target+  " is at index " + out + " in " + (endTime - startTime) + " Nano seconds");
        


        
    }


    static int BinarySeach(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        return search(arr,target,low,high);
        
    }
    
    static int search(int[] arr, int target, int low,int high){
            int mid = (low + high) / 2; 
            if(low > high) {
                return -1;
            }
            if(target == arr[mid]){
                return mid;
            } else if ( target > arr[mid]) {
                return search(arr, target,mid +1, high);
            } else {
                return search(arr,target,low,mid -1);
            }
    }
    
}
