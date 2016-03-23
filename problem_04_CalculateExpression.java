import java.util.Locale;
import java.util.Scanner;

public class problem_04_CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double firstResult = firstFun(a, b, c);
        double secondResult = secondFn(a, b, c);
        //F1 result: 6.45; F2 result: 8.00; Diff: 3.89
        // System.out.printf("%.2f",firstResult);
        double avg = (a + b + c) / 3;
        double diff = Math.abs(((firstResult + secondResult) / 2) - avg);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstResult, secondResult, diff);
    }

    private static double secondFn(double a, double b, double c) {
        double num = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3));
        double power = (a - b);
        return Math.pow(num,power);
    }

    private static double firstFun(double a, double b, double c) {

        double num = ((Math.pow(a, 2) + Math.pow(b, 2))) / (Math.pow(a, 2) - Math.pow(b, 2));
        double power = (a + b + c) / Math.sqrt(c);
        return Math.pow(num, power);
    }
}
