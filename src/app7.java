import java.util.Scanner;

public class app7 {
    public static void main (String[] args) {
        System.out.println("\t/// Задача 7 ///");
        System.out.println("/// Кормление уточки ///");
        String s;
        float v,v1,q,q1,q2=90;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите объём желудка: ");
        s = scanner.nextLine();
        v = Float.parseFloat(s);

        System.out.println("Введите обьём съеденного: ");
        s = scanner.nextLine();
        v1 = Float.parseFloat(s);

        q=(v1/v)*100;
            if (q >= q2){
                q1 = q - q2;
                System.out.printf("Уточка перекормлена на %.2f процента(ов)",q1);
            }else{
        System.out.printf("Уточка накормлена на %.2f процента(ов)",q);
        }
    }
}