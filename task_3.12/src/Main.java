public class Main
{
    public static void main(String[] args)
    {
        getNumbers getNumbers = new getNumbers();

        System.out.println("Изначальынй массив:");
        getNumbers.getNumber();
        System.out.println();
        System.out.println("Массив, который удовлетворяет условия:");
        getNumbers.endInZero();
    }
}