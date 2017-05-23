import java.util.Scanner;

public class app2 {
    public static void main (String[] args){

        System.out.println("\t/// Задача 2 ///");
        System.out.println("/// Напишите метод, заменяющий" +
                                " в строке все вхождения " +
                                "слова «бяка» на «вырезано цензурой» ///");
        String s = "Ах, ты, бяка";
        String s2 = s.replaceAll("бяка", "... (слово вырезано цензурой)");
        System.out.println(s2);
    }
}
