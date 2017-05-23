import java.util.Scanner;

public class app1 {
    public static void main (String[] args){

        System.out.println("\t/// Задача 1 ///");
        System.out.println("/// Массив из заданного эл-та увел. на 10% ///");
        String s;
        float[] arr;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        s = scanner.nextLine();
        int length = Integer.parseInt(s);

        arr = new float[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Введите %d эл-т: ", i);
            s = scanner.nextLine();
            arr[i] = Float.parseFloat(s);
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + arr[i] * (1.0f/10);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.printf("Заданный элемент: %.2f\n", arr[i]);
        }
    }
}
