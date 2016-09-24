import java.io.*;
import java.util.*;

public class Solution {
    public void Fibonacci(long limit) {
        long sum = 0, a=1, b=1;
        while (b<limit) {
            if (b%2==0)
                sum+=b;
            long h = a+b;
            a=b;
            b=h;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        long l;
        while(s.hasNext()) {
            l = s.nextLong();
            p.Fibonacci(l);
        }        
    }
}
