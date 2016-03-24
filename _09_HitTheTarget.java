import java.util.Scanner;

public class _09_HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNum = scanner.nextInt();
        for (int i = 1; i < 20; i++) {

            for (int j = 1; j < 20; j++) {
                if (i + j == targetNum) {
                    System.out.printf("%d + %d = %d \n", i, j, targetNum);
                } else if (Math.abs(i - j) == targetNum) {
                    System.out.printf("%d - %d = %d \n", Math.max(i, j), Math.min(i, j), targetNum);
                }
            }
        }

    }
}
