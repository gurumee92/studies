import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();

        if (number < 2 || number > 9) {
            System.out.printf("입력한 숫자 %d가 2-9 사이 수가 아닙니다.\n", number);
            System.exit(1);
        }

        for (int i = 1; i <= 9; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d\n", number, i, result);
        }
    }
}