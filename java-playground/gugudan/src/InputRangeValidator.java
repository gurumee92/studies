public class InputRangeValidator {
    private final int start;
    private final int end;

    InputRangeValidator(int start, int end) {
        this.start = start;
        this.end = end;
    }
    boolean isValidate(int parameter) {
        return start <= parameter && parameter <= end;
    }
}
