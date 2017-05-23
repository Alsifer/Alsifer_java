import java.util.Scanner;

public class app3 {
    public static void main (String[] args){

        System.out.println("\t/// Задача 3 ///");
        System.out.println("/// Придумайте способ превращения числа, в массив из его разрядов. Пример: 562 -> [5,6,2] ///");

        Scanner sc = new Scanner(System.in);
        int x = 0;
        //Ввод
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
        } else {
            System.out.println("Это не целое число!");
            return;
        }

        //Решение
        char[] array1 = Integer.toString(x).toCharArray();
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = Character.getNumericValue(array1[i]);
        }

        //Вывод
        System.out.print("[");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(",");
            } else {
                System.out.print("]");
            }
        }
    }
}


