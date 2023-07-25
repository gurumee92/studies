public class TimesTable {
    public static final int TIME_MIN = 2;
    public static final int TIME_MAX = 9;
    public static final int ROW_MIN = 1;
    public static final int ROW_MAX = 9;


    private final int time;
    private int[] table = new int[ROW_MAX];

    public TimesTable(int time) {
        this.time = time;

        for (int row = 0; row< ROW_MAX; row++) {
            table[row] = time * (row+1);
        }
    }

    public void print() {
        printUntilRow(ROW_MAX);
    }

    public void printUntilRow(int row) {
        for (int i = 0; i < row; i++) {
            System.out.printf("%d x %d = %d\n", time, (i+1), table[i]);
        }
    }
}
