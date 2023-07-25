import java.util.Arrays;

public class GuGudan {
    public static final int MIN = 2;
    public static final int MAX = 9;
    private final int factor;
    private final int[] dan;

    public GuGudan(int factor) {
        this.factor = factor;
        this.dan = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            this.dan[i] = this.factor * (i + 1);
        }
    }
    private boolean isValidate() {
        return MIN <= factor && factor <= MAX;
    }

    public void print() throws Exception {
        if (!isValidate()) {
            String message = String.format("factor %d는 %d-%d 사이의 값이 아닙니다.", factor, MIN, MAX);
            throw new Exception(message);
        }
        Arrays.stream(this.dan).forEach(System.out::println);
    }
}
