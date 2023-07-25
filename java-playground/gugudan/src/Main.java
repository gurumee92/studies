import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int MIN = 2;
    private static final int MAX = 9;

    private static int[] calculate(int number) {
        int[] result = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            result[i] = number * (i + 1);
        }
        return result;
    }

    private static void print(int[] dan) {
        Arrays.stream(dan).forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();

        if (number < MIN || number > MAX) {
            System.out.printf("입력한 숫자 %d가 %d-%d 사이 수가 아닙니다.\n", number, MIN, MAX);
            System.exit(1);
        }

        int[] dan = Main.calculate(number);
        Main.print(dan);
    }
}