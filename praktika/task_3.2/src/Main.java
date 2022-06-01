import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int num;

    public static void main(String[] args)
    {
        num = getNumber();
        System.out.println("Вы ввели число: " + num);
        condition();
        System.out.println();
        System.out.println("Конец программы");

    }
    public static int getNumber()
    {
        System.out.print("Введите целое положительное число: ");
        int num1 = scanner.nextInt();
        if (num1 < 0)
        {
            System.out.println("Вы ввели неверное число.");
            num1 = getNumber();
        }
        return num1;
    }
    public static void condition()
    {
        int[] array = new int[17];
        int temp = 2;
        System.out.print("Заполнение массива на +1: ");
        for (int i = 0; i < array.length; i++)
        {
            num++;
            array[i] = num;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Вывод каждого числа +3: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
            i = i + temp;
        }
    }
}