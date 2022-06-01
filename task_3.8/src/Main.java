import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        createArray();
    }
    public static void createArray()
    {
        int[] array = new int[24];
        Random random = new Random();
        int maxValue = 0;
        System.out.println("Ваш массив:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(900) + 100;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++)
        {
            if (maxValue < array[i])
            {
                maxValue = array[i];
            }
        }
        System.out.println("Максимальное значение в массиве было: " + maxValue);
    }
}