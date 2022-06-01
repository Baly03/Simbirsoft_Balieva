import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел должно быть в последовательности: ");
        int num = scanner.nextInt();
        int one = 1;
        int two = 1;
        int out;
        System.out.print(one + " " + two + " ");
        for(int i = 3; i <= num; i++)
        {
            out = one + two;
            System.out.print(out + " ");
            one = two;
            two = out;
        }
    }
}