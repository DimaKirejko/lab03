public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Fibo fibonacci = new Fibo();

        int n = 6;
        int recursionFactorialResult = factorial.recursionExecute(n);
        int cycleFactorialResult = factorial.cycleExecute(n);
        assert recursionFactorialResult == cycleFactorialResult : "ERROR in factorial results";

        System.out.println("Factorial of " + n + ": " + recursionFactorialResult);

        int recursionFibonacci = fibonacci.recursionExecute(n);
        int FiboResult = fibonacci.cycleExecute(n);
        assert recursionFibonacci == FiboResult : "ERROR in fibonacci number results";

        System.out.println("Fibonacci number at position " + n + ": " + recursionFibonacci);

        Sum nsum = new Sum();
        TwoNums TwoNums = new TwoNums();

        int num = 1234;
        int Digits = nsum.execute(num);
        int Sum = TwoNums.execute(5, 10);

        System.out.println("Sum of digits in " + num + ": " + Digits);
        System.out.println("Recursive sum of 5 and 10: " + Sum);
    }
}
