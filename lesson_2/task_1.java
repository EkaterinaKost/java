package lesson_2;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.
import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_1.class.getName());
        FileHandler fh = new FileHandler("logTask1.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int[] array = { 5, 4, 1, 3, 2 };
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int[] newArr = BubllSort(array);
        System.out.println("отсортированный массив: " + Arrays.toString(newArr));

    }

    public static int[] BubllSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

}