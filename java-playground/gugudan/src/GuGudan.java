import java.util.Arrays;

public class GuGudan {
    public static final int MIN = 2;
    public static final int MAX = 19;
    private final int factor;
    private int[] dan;

    public GuGudan(int factor) {
        this.factor = factor;
    }
    private boolean isValidate() {
        return MIN <= factor && factor <= MAX;
    }

    public void init() throws GugudanValidateException {
        if (!isValidate()) {
            throw new GugudanValidateException(factor);
        }

        if (factor < 10) {
            dan = new int[9];
        } else {
            dan = new int[MAX];
        }

        for (int i = 0; i < dan.length; i++) {
            dan[i] = factor * (i + 1);
        }
    }

    public boolean isInitialize() {
        return dan == null;
    }

    public void print() throws GugudanInitializeException {
        if (isInitialize()) {
            throw new GugudanInitializeException();
        }

        System.out.printf("출력할 단은?: %d\n", factor);
        for (int i = 0; i < dan.length; i++) {
            System.out.printf("%d x %d = %d\n", factor, (i+1), dan[i]);
        }
    }

    public void print(int finsihed) throws GugudanInitializeException {
        if (isInitialize()) {
            throw new GugudanInitializeException();
        }

        System.out.printf("출력할 단은?: %d\n", factor);
        for (int i = 0; i < dan.length; i++) {
            System.out.printf("%d x %d = %d\n", factor, (i+1), dan[i]);
        }
    }

    private static class GugudanValidateException extends Exception{
        private final int factor;
        GugudanValidateException(int factor) {
            this.factor = factor;
        }

        @Override
        public String getMessage() {
            return String.format("factor %d는 %d-%d 사이 수가 아닙니다.", factor, MIN, MAX);
        }
    }

    private static class GugudanInitializeException extends Exception{
        GugudanInitializeException() {
            super("단이 초기화되지 않았습니다.");
        }
    }
}
