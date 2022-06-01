public class Main
{
    public static void main(String[] args)
    {
        createArray();
    }
    public static void createArray()
    {
        int[] array = new int[90];
        int start = 10;
        System.out.println("Заполните массив: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = start;
            System.out.print(array[i] + " ");
            start++;
        }
        System.out.println();
        System.out.println("Вывод положительных двузначных чисел: ");
        for (int i = 0; i < array.length; i++)
        {
            if ((array[i] + array[i++]) <= 99)
            {
                System.out.print(array[i] + " ");
            }
        }
    }
}