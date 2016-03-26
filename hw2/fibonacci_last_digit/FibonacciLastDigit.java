import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
    int re = 0;
   	int[] series = new int[n];
    if (n == 0 && n == 1) {
      re = 1;
    }else if (n >= 2) {
    series[0] = 1;
    series[1] = 1;
    int i = 2;
    for (; i < n; i++) {
      series[i] = (series[i - 1] + series[i - 2]) % 10;
    }
    re = series[i - 1];   
    }
    return re;
    }
    
    public static void main(String[] args) {
    	while(true){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
    }
}

