import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двухзначное число: ");
        String num = scanner.next();
        char[] numArr = num.toCharArray();
        if (numArr.length != 2)
        {
            System.out.println("Вы ввели не двухзначное число");
            System.exit(0);
        }

        if (numArr[0] > numArr[1])
        {
            System.out.println("Первая цифра двухзначного числа больше второго.");
        }
        else if (numArr[0] < numArr[1])
        {
            System.out.println("Первая цифра двухзначного числа меньше второго.");
        }
    }
}