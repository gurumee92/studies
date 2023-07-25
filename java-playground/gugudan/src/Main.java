public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=19; i++) {
            GuGudan dan = new GuGudan(i);
            try {
                dan.init();
                dan.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}