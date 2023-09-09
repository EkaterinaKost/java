package ALGORITHMS;

import java.util.Random;
import java.util.Scanner;

public class hw1 {
    private static final Random random = new Random();
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int[] arr = prepareArray(n);
        printArray(arr);
        sort(arr);
        printArray(arr);
        iScanner.close();
    }
        

    
    private static void printArray(int[] arr){
        String result = "massiv = [";
        for (int e : arr) {
            result +=" "+e+",";
        }
        result=result.substring(0, result.length()-1);
        result+="]";
        System.out.println(result);
    }
    private static int[] prepareArray (int length) {
        int [] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i]=random.nextInt(10);
        }
        return result;
    }

   public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest=leftChild;
        }
        if (rightChild < heapSize && array[rightChild] > array[largest] ) {
            largest=rightChild;
        }
        if (largest!=rootIndex) {
            int temp=array[rootIndex];
            array[rootIndex]=array[largest];
            largest=temp;
            heapify(array, heapSize, largest);
        }
    }
   
}
