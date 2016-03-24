import java.util.Locale;
import java.util.Scanner;

public class _08_OddEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        String[] numbers = scanner.nextLine().split(" ");
        if (numbers.length % 2 != 0) {
            System.out.println("Invalid length");
            return;
        }
        for (int i = 0; i < numbers.length - 1; i+=2) {
            int firstNum = Integer.parseInt(numbers[i]);
            int secondNum = Integer.parseInt(numbers[i + 1]);
            if (firstNum % 2 == 0 && secondNum % 2 == 0) {
                System.out.printf("%d, %d -> both are even \n", firstNum, secondNum);
                //2, 8 -> both are even
            } else if (firstNum % 2 != 0 && secondNum % 2 != 0) {
                System.out.printf("%d, %d -> both are odd \n", firstNum, secondNum);
            }else{
                System.out.printf("%d, %d -> different \n", firstNum, secondNum);

            }

        }
    }

}
