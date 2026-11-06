public class Task1 {
    public static void main(String[] args) {
        // Задание 1. Вариант 3: Найти сумму всех элементов массива.
       // int[] nums = {12, 5, 8, 3, 14, 7, -2};
int[] nums = new int[5];
int s=0;
for (s=0;s <nums.length;s++)
{
    nums[s] = (int)(Math.random()* 10);
}



        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Сумма элементов массива: " + sum);
    }
}