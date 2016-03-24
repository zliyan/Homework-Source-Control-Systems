import java.util.Locale;
import java.util.Scanner;

public class _05_DecTo7thBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int decNum = scanner.nextInt();
        String result = "";
        while (decNum > 0){
            result = decNum % 7 + result;
            decNum /= 7;
        }
        System.out.println(result);
    }
}