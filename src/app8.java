import java.util.Scanner;

public class app8 {
    public static void main (String[] args){

        System.out.printf("Введите строку\n");

        String s = null;
        List list = new List();

        Scanner sc = new Scanner(System.in);

        s = sc.nextLine();

        System.out.printf("Размер строки = %d\n",s.length());

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                list.pushHead(c);
            }else if(c == ')'){
                if(list.getSize() == 0){
                    System.out.println("Строка не сбалансирована");
                    System.exit(0);
                }else{
                    char ch = list.pullHead();
                }
            }
            System.out.printf("Размер стека = %d\n",list.getSize());
        }

        if(list.getSize() != 0){
            System.out.println("Строка не сбалансирована");
            }else{
            System.out.println("Строка сбалансирована");
        }
    }
 }

