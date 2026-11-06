import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        if (!str.isEmpty()) {

            char lastChar = str.charAt(str.length() - 1);
            System.out.println("Последний символ: " + lastChar);
        } else {
            System.out.println("Строка пустая!");
        }
        scanner.close();
    }
}