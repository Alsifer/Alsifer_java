import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        System.out.println("\t/// Задача 5 ///");
        System.out.println("/// Зарплата за неделю///");

        String s;
        float money, hour, hour1=40, hour5, hour6, h1=1.5f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите зарплату в час: ");
        s = scanner.nextLine();
        money = Float.parseFloat(s);

        System.out.println("Введите кол-во прораб. часов: ");
        s = scanner.nextLine();
        hour = Float.parseFloat(s);

        if (money < 8) {
            System.out.printf("Зарплата недостойная работника");
        } else if (money >= 8) {
            if (hour > 40 || hour < 60) {
                hour6 = ((money * hour1) + ((hour - hour1) * h1));
                System.out.printf("Зарплата работника за неделю: %.2f", hour6);
            } else if (hour <= 40) {
                hour5 = hour * money;
                System.out.printf("Зарплата работника за неделю: %.2f", hour5);
            }
        }
    }
}
