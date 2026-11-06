public class Task2 {
    public static void main(String[] args) {
        // Задание 2. Вариант 3: Найти сумму элементов побочной диагонали.
        int[][] matrix = {
                {1,  2,  3},
                {4,  5,  6},
                {7,  8,  9}
        };

        int sum = 0;
        int n = matrix.length;
        for(int i = 0; i<n; i++){
            for (int j=0 ; j<n - 1 - i; j++){
                sum+= matrix[i][j];
            }
        }

        System.out.println("Сумма элементов побочной диагонали: " + sum);
    }
}
