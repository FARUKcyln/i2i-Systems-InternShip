public class Fibonacci {

    static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    static boolean isFibonacciRecursively(int n)
    {
        return isPerfectSquare(5*n*n + 4) ||
                isPerfectSquare(5*n*n - 4);
    }

    static boolean isFibonacci(int number) {
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

    public static void main(String[] args) {

        long beginTime = System.nanoTime();
        isFibonacci(34);
        long endTime  = System.nanoTime();

        long executionTime = (endTime - beginTime) / 1000;
        System.out.println("Dynamic Result : " + executionTime + " second");

        beginTime = System.nanoTime();
        isFibonacciRecursively(34);
        endTime  = System.nanoTime();

        executionTime = (endTime - beginTime) / 1000;
        System.out.println("Recursive Result : " + executionTime + " second");

    }

}
