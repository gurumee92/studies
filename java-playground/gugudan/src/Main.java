public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.printf("출력할 단: %d\n", i);
            GuGudan dan = new GuGudan(i);
            try {
                dan.print();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}