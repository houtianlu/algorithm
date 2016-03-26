import java.util.Scanner;

public class Fib {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long[] series = new long[n + 1];
    if (n == 0 && n == 1) {
      System.out.println(1);
    }else if (n >= 2) {
    series[0] = 0;
    series[1] = 1;
    for (int i = 2; i < n + 1; i++) {
      series[i] = series[i - 1] + series[i - 2];
    }
    System.out.println(series[n]);    
    }
  }
}
