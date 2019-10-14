package dynamicProgramming;

public class Fibonacci {

	int fibonacciRecursive(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
		}
	}

	//dynamic programming
	int fibonacci(int n) {
		int memo[] = new int[100];
		if (n <= 1) {
			return n;
		} else {
			if (memo[n] > 0) { // 이미 계산되어 Memoization 된 상태라면 그대로 이용 !
				return memo[n];
			}
			memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
			return memo[n];
		}
	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.fibonacci(100);
	}
}
