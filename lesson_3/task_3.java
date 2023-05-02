package lesson_3;
//Задан целочисленный список ArrayList. Найти минимальное, 
//максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        int n = 10;
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(rnd.nextInt(0, 100));
        }
        System.out.println(arr);
        minMaxAverg(arr);
        
    }

    private static void minMaxAverg(ArrayList<Integer> arr) {
        int min=arr.get(0);
        int max=arr.get(0);
        int sum=arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum+=arr.get(i);
            if (arr.get(i)<min){
                min=arr.get(i);
            }
            if (arr.get(i)>max){
                max=arr.get(i);
                
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: "+ max);
        System.out.println("average value: "+ Double.valueOf(sum/arr.size()));
    }
    
}
