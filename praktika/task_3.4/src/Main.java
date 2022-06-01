import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int x;
    public static void main(String[] args)
    {
        x = getNumber();
        System.out.println("Вы ввели: " + x);
        findDivisor();
    }

    public static int getNumber()
    {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number <= 0)
        {
            System.out.println("Вы ввели неверное число.");
            number = getNumber();
        }
        return number;
    }
    public static void findDivisor()
    {
        int[] arrayDivisor = new int[x];
        int start = 1;
        int count = 0;
        for (int i = 0; i < arrayDivisor.length; i++)
        {
            arrayDivisor[i] = start;
            start++;
        }

        for (int i = 0; i < arrayDivisor.length; i++)
        {
            if (x % arrayDivisor[i] == 0)
            {
                count++;
                System.out.println("Вариант №" + count);
                System.out.println(x + ":" + arrayDivisor[i] + "=" + (x/arrayDivisor[i]));
            }
        }
    }
}