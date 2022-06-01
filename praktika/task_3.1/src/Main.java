public class Main {
    public static void main(String[] args)
    {
        getArray();
    }
    public static void getArray()
    {
        int[] array = new int [90];
        int num = 10;
        System.out.println("Отсортированный массив:");
        for (int a = 0; a < array.length; a++)
        {
            array[a] = num;
            num++;
            if (array[a] % 2 == 0)
            {
                System.out.print(array[a] + " ");
            }
        }
        System.out.println();
        System.out.println("Конец программы");
    }
}