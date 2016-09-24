import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Solution {
    public static void sumofdigits(int  s ) {
        final String bignumber = BigInteger.valueOf(2).pow(s).toString(10);
        //System.out.println(bignumber);
        long result = 0;
        for (int i = 0; i < bignumber.length(); i++) {
                result += Integer.valueOf(String.valueOf(bignumber.charAt(i)));
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Solution p = new Solution();
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        while(s.hasNext()) {
            int n = s.nextInt();
            p.sumofdigits(n);
        }     
        
    }
}
