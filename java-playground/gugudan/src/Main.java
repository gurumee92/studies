import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] splitedValue = inputValue.split(",");
        int factor = Integer.parseInt(splitedValue[0]);
        int finished = Integer.parseInt(splitedValue[1]);

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