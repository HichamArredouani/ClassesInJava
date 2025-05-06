public class Calculator {
    public static int sum(int... operands) {
        int totalSum = 0;
        for (int operand : operands) {
            totalSum += operand;
        }
        return totalSum;
    }


    public static int max(int... values) {
        int max = 0;
        for (int value: values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
