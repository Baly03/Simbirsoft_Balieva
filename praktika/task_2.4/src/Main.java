import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Object;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[2];
        System.out.print("Введите первое число: ");
        arr[0] = scanner.nextInt();
        System.out.print("Введите второе число: ");
        arr[1] = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println("Числа в порядке возрастания: " + arr[0] + " " + arr[1]);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Числа в порядке убывания: " + arr[0] + " " + arr[1]);
    }
}