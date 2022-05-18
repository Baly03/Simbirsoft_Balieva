import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();
        if (first > second)
        {
            System.out.print("Первое число больше второго");
        }
        else if (first < second)
        {
            System.out.print("Первое число меньше второго");
        }
        else
        {
            System.out.print("Числа равны");
        }
    }
}