import java.util.Scanner;
public class getNumber
{
    private int number;
    public int getNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        if(scanner.hasNextInt())
        {
            number = scanner.nextInt();
        }
        else
        {
            System.out.println("Ошибка. Введено не число");
            getNumber();
        }
        System.out.println("Вы ввели число: " + number);
        scanner.close();
        return 0;
    }
    public int actionChoice()
    {
        System.out.print("Делителями числа " + number + " являются числа: ");
        for(int i = number; i > 0; i--)
        {
            int b = number % i;
            if (b == 0)
            {
                System.out.print(i + ", ");
            }
        }
        return 0;
    }
}
