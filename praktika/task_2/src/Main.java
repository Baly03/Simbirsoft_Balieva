import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        System.out.println("Вы ввели число: " + num);
    }
}