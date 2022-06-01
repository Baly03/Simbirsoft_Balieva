public class Main
{
    public static void main(String[] args)
    {
        getNumbers getNumbers = new getNumbers();
        System.out.println("Ваш случайно сгенерированный массив:");
        getNumbers.getValueToIndex();
        System.out.println();
        getNumbers.getMaxNumber();
    }
}