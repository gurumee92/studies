import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. 사용자 입력
        Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();
        final String regex = ",";
        final String[] split = input.split(regex);
        final int time = Integer.parseInt(split[0]);
        final int row = Integer.parseInt(split[1]);

        // 2. 입력 validation
        InputRangeValidator timeRangeValidator = new InputRangeValidator(TimesTable.TIME_MIN, TimesTable.TIME_MAX);
        InputRangeValidator rowRangeValidator = new InputRangeValidator(TimesTable.ROW_MIN, TimesTable.ROW_MAX);

        if (!timeRangeValidator.isValidate(time)) {
            System.out.printf("단(time) %d가 %d-%d 사이의 수가 아닙니다.", time, TimesTable.TIME_MIN, TimesTable.TIME_MAX);
            System.exit(1);
        }

        if (!rowRangeValidator.isValidate(row)) {
            System.out.printf("출력할 최대 단수(row) %d가 %d-%d 사이의 수가 아닙니다.", row, TimesTable.ROW_MIN, TimesTable.ROW_MAX);
            System.exit(1);
        }
        
        // 3. 구구단 생성 및 출력
        TimesTable table = new TimesTable(time);
        System.out.printf("출력할 단(time)은: %d\n", time);
        table.print();

        System.out.printf("출력할 단(time)은: %d 단수(row)는: %d\n", time, row);
        table.printUntilRow(row);
    }
}