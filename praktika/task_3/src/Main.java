import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int width = scanner.nextInt();
        System.out.print("Введите высоту прямоугольника: ");
        int height = scanner.nextInt();
        System.out.print("\nПериметр прямоугольника равен: " + (2*(width+height)) + "\nПлощадь прямоугольника равна: "+ (width*height) + "\nДлина диагонали периметра равна: " + (Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2))));
    }
}