import java.io.*;
import java.util.*;

public class Solution {
    public void naturalNumberPE(long i) {
        long target = i-1;
        long p1 = SumDivisibleBy(3,target);
        //System.out.println(p1);
        long p2 = SumDivisibleBy(5,target);
        //System.out.println(p2);
        long p3 = SumDivisibleBy(15,target);
        //System.out.println(p3);
        long fp = p1+p2-p3;
        System.out.println(fp);
    }
    
    public long SumDivisibleBy(long n, long target) {
        long p= target / n;
        return (n*(p*(p+1))) /2;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        //int count = 1;
        long l;
        while(s.hasNext()) {
            l = s.nextLong();
            p.naturalNumberPE(l);
            //count++;
        }
    }
}
