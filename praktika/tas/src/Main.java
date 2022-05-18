import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        //1.1 Составить программу вывода на экран в одну строку трех любых чисел с двумя пробелами между ними.

        int a = 0 + (int) (Math.random()*77);
        int b = 0 + (int) (Math.random()*77);
        int c = 0 + (int) (Math.random()*77);

        System.out.print(a + "  " + b + "  " + c);
    }
}