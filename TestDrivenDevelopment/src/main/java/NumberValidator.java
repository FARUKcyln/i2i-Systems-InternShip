public class NumberValidator {

    public boolean isValid(int number) {
        if (isFibonacci(number) && isPrime(number)) {
            return true;
        } else {
            return false;
        }
    }


    private boolean isPrime(int number) {
        if (number > 1) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean isFibonacci(int number) {
        int n1 = 0, n2 = 1;
        while (n1 <= number) {
            if (n1 == number) {
                return true;
            }
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }

        return false;
    }
}
