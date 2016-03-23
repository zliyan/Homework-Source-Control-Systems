import java.util.Locale;
import java.util.Scanner;

public class problem_05_decTo7thBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        String decNum = scanner.nextLine();
        int convertedNumber = 0;
        int power = 0;
        for (int i = decNum.length() - 1; i >= 0; i--) {
            double digit = Double.parseDouble("" + decNum.charAt(i));
            digit *= (Math.pow(7, power));
            convertedNumber += digit;
            power++;
        }
        System.out.println(convertedNumber);
    }
}