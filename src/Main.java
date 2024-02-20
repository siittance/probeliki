import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String stroka = sc.nextLine();
        String izmen = stroka.replaceAll("\\s", "").toLowerCase();
        boolean proverka = true;
        int dlina = izmen.length();
        for (int i = 0; i < dlina / 2; i++) {
            if (izmen.charAt(i) != izmen.charAt(dlina - i - 1)) {
                proverka = false;
                break;
            }
        }
        if (proverka) {
            System.out.println("Введенная строка является палиндромом.");
            System.out.println("Измененная строка: " + izmen);
        } else {
            System.out.println("Введенная строка не является палиндромом.");
            System.out.println("Измененная строка: " + izmen);
            System.out.println("Программа завершена.");
        }
    }
}
