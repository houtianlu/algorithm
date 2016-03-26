import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHuge(long n, long m) {
        //write your code here
        long positon = 0;
        long num = 0;
        long[] series = new long[100000];
        long[] mod = new long[100000];
        if (n == 0 && n == 1) {
        return m;
        }else if (n >= 2) {
        series[0] = 0;
        series[1] = 1;
        mod[0] = 0;
        mod[1] = 1;
        long i = 2;
        while(mod[(int)i] != 1 & mod[(int)i - 1] != 0) {
            series[(int)i] = series[(int)i - 1] + series[(int)i - 2];
            mod[(int)i] = series[(int)i] % m;
            num = i;
            System.out.println("i = " + i + "fi = " + series[(int)i]);
            System.out.println("i = " + i + "modi = " + mod[(int)i]);
            i++;
            }
            System.out.println("num = " + num);
        positon = n % num;
        System.out.println("positon is " + positon);
        System.out.println(series[(int)positon]);   
        }
        return series[(int)positon] % m;
    }
    
    public static void main(String[] args) {
        while(true){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHuge(n, m));
        }
    }
}

