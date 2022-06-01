public class Main
{
    public static void main(String[] args)
    {
        factory();
    }
    public static void factory()
    {
        int[] arrayDia = new int[121];
        int[] arrayWei = new int[121];
        int count = 0;
        //Рандом диаметра шариков
        for (int i = 0; i < arrayDia.length; i++)
        {
            arrayDia[i] = 20 + (int) (Math.random() * 5);
        }
        //Рандом веса шариков
        for (int i = 1; i < arrayWei.length; i++)
        {
            arrayWei[i] = 70 + (int) (Math.random() * 10);
        }
        for (int i = 1; i < arrayWei.length; i++)
        {
            if ((arrayDia[i] >= 22 && arrayDia[i] <= 26) && (arrayWei[i] >= 71 && arrayWei[i] <= 77))
            {
                count++;
                System.out.println(i + " шарик имеет вес " + arrayWei[i] + " и его диаметр составляет " + arrayDia[i] + ":ГОСТ.");
            }
            else
            {
                System.out.println(i + " шарик имеет вес " + arrayWei[i] + " и его диаметр составляет " + arrayDia[i] + ":брак.");
            }
        }
        System.out.println("Количество шариков без брака: " + count);
    }
}