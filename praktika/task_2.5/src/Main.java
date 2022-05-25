import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите отрицательное число: ");
        int num = scanner.nextInt();

        if (num < 0)
        {
            System.out.println("Квадрат числа равен: " + Math.pow(num, 2));
        }
        else System.out.println("Ошибка");
    }
}