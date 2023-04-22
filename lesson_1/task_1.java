/*Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 
(произведение чисел от 1 до n)*/
package lesson_1;

public class task_1 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int factual=1;
        for (int i = 1; i <= n; i++) {

            sum = sum + i;
            factual = factual*i;

        }
        System.out.println(sum);
        System.out.println(factual);



    }

}
