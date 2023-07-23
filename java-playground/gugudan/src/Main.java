import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        System.out.printf("number: %d\n", number);

        int result = number * 1;
        System.out.printf("%d x %d = %d\n", number, 1, result);
        result = number * 2;
        System.out.printf("%d x %d = %d\n", number, 2, result);
        result = number * 3;
        System.out.printf("%d x %d = %d\n", number, 3, result);
        result = number * 4;
        System.out.printf("%d x %d = %d\n", number, 4, result);
        result = number * 5;
        System.out.printf("%d x %d = %d\n", number, 5, result);
        result = number * 6;
        System.out.printf("%d x %d = %d\n", number, 6, result);
        result = number * 7;
        System.out.printf("%d x %d = %d\n", number, 7, result);
        result = number * 8;
        System.out.printf("%d x %d = %d\n", number, 8, result);
        result = number * 9;
        System.out.printf("%d x %d = %d\n", number, 9, result);
    }
}