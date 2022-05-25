import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        if (num < 0)
        {
            num = Math.abs(num);
        }
        else
        {
            num = 0;
        }
         System.out.print("Результат: " + num);
    }
}