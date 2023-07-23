import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        System.out.printf("number: %d\n", number);

        for (int i=1; i<=9; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d\n", number, i, result);
        }
    }
}