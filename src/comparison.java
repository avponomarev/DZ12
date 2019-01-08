import java.util.Scanner;

public class comparison {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку с клавиатуры");
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        int len = s.length();
        System.out.println("Длина первой введенной строки равна " + len);
        System.out.println("Введите вторую строку с клавиатуры");
        Scanner sc1 = new Scanner(System.in);
        String s1;
        s1 = sc1.nextLine();
        int len1 = s1.length();
        System.out.println("Длина второй введенной строки равна " + len1);
        System.out.println("Вывод самой длинной строки в консоль:");
        if (len > len1){
            System.out.println(s);
        }
        if (len < len1) {
            System.out.println(s1);
        }
        if (len == len1) {
            System.out.println("Строки равны");
        }
    }
}