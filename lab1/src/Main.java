import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
            {
                // 3. Пользователь вводит два числа, вывести их сумму.
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a + b);
                break;
            }
            case 2:
            {
                // 3. Найти модуль числа без использования Math.abs().
                int x = scanner.nextInt();
                if (x < 0) {
                    x = -x;
                }
                System.out.println(x);
                break;
            }
            case 3:
            {
                // 3. Вывести все четные числа от 2 до 100.
//                for (int i = 2; i <= 100; i += 2) {
//                    System.out.print(i + " ");
//                }
                int i=2;
                do{
                    i=i+2;
                    System.out.println(i + " ");

                } while(i<=100);
                //

                int n = 1;
                while (n < 10) {
                    System.out.println(n);
                    n++;
                }


            }
                break;
            }
        }
    }