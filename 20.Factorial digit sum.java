import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Solution {
    public void sumofdigits(int n) {
        BigInteger num =  BigInteger.ONE;
        for (int i=1;i<=n;i++){
            num = num.multiply(BigInteger.valueOf(i));
        }
        final String bignumber = num.toString();
        long result = 0;
        for (int i = 0; i < bignumber.length(); i++) {
            result += Integer.valueOf(String.valueOf(bignumber.charAt(i)));
        }
        System.out.println( result);
    }

    public static void main(String[] args) {
        Solution p = new Solution();
        //p.sumofdigits();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(s.hasNext()) {
            int l = s.nextInt();
           p.sumofdigits(l);
        }     
    }
}
