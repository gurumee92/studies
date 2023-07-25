import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();
        final String regex = ",";
        final String[] split = input.split(regex);
        final int factor = Integer.parseInt(split[0]);
        final int finished = Integer.parseInt(split[1]);

        Gugudan gugudan = new Gugudan(factor);
        try {
            gugudan.init();
            gugudan.printUntilFinished(finished);
            gugudan.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}