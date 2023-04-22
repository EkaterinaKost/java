//Вывести все простые числа от 1 до 1000
package lesson_1;

public class task_2 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 0;
        for (i = 1; i < 1000; i++) {
            k = (int) Math.sqrt(i);
            for (j = 2; j <= k; j++) {
                if (i % j == 0)
                    break;
            }
            if (j > k) {
                System.out.print(i + " ");
            }
        }

    }
}
