import java.util.Scanner;

public class app4 {
    public static void main (String[] args){
        System.out.println("\t/// Задача 4 ///");
        System.out.println("/// Скорость движения в пути///");
        String s;
        float N,T,U;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите длину пути, км: ");
        s = scanner.nextLine();
        N = Float.parseFloat(s);

        System.out.println("Введите время движения в пути, ч: ");
        s = scanner.nextLine();
        T = Float.parseFloat(s);

        U = N / T;

        System.out.printf("Скорость движения: %.2f км/ч",U);
    }
}

