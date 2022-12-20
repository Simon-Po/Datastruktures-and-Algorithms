package Algorithms.Bubble_sort;

import java.util.Random;


public class App {
    public static void main(String[] args) {
        
        int[] arr = new int[100];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(0,100);
        }
        
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ",");
        // // }
        // System.out.println("");
        arr = bubbleSort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ",");
        // }


    }

    private static int[] bubbleSort(int[] arr) {
        int swaps = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                
                if(arr[j] > arr[j +1]) {
                    swaps++;
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = temp;
                    swapped = true;
                }
                
            }
            if(!swapped) {
                break;
            }
        }
        System.out.println(swaps);
        return arr;
    }
}
