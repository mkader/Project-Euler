import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Solution {
    public void routes(int n, int m) {
        //int n=20;
        BigInteger n2f = factorial((n+m));
        
        BigInteger n1f = factorial(n);
        BigInteger m1f = factorial(m);
        //System.out.println(n2f + " " + n1f + " " +m1f);
        BigInteger line  = n2f.divide((n1f.multiply(m1f)));
        BigInteger mo =  new BigInteger("1000000007");
        System.out.println(line.mod(mo));
    }

    public BigInteger factorial(int n) {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }

    public static void main(String[] args) {
        Solution p = new Solution();
        
        
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        while(s.hasNext()) {
            int n = s.nextInt();
            int m = s.nextInt();
            p.routes(n,m);
        }     
    }
}
