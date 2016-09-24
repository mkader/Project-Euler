import java.io.*;
import java.util.*;

public class Solution {
   public long[] primesPE() {
        long l=10000000l;
        long cl = (long)Math.sqrt((double)l);
        boolean s[] = new boolean[(int)(l+1)];
        //System.out.println (s.length);
        Arrays.fill(s, false);
        for (int i=4;i<=l;i=i+2) {
            s[i]=true;
        }
        for (int i=3;i<=cl;i=i+2) {
            if (!s[i]) {
                //System.out.print(i);
                for (int j=i*i;j<=l;j=j+(2*i)) {
                    s[j]=true;
                    //System.out.print(" -  " + j);
                }
                //System.out.println("");
            }
        }
        long sum =0;
        long sp[]= new long[(int)(l+1)];
        for (int i=2;i<=l;i++){
            if(!s[i]) {
                sum+= i;
            }
            sp[i]=sum;
        }
        //for (int i=2;i<=l;i++){
        //    System.out.println(i + " " + sp[i]);
        //}
        //System.out.println(sum);
        return sp;
    }
    public void sumPrime(long[] p, long l) {
        System.out.println(p[(int)l]);
            
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        long primes[] = p.primesPE();
        //p.sumPrime(primes, l)
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        long l;
        while(s.hasNext()) {
            l = s.nextLong();
            if (l==1) System.out.println("1");
            else if (l==2) System.out.println("2");
            else if (l<=4) System.out.println("5");
            else  System.out.println(primes[(int)l]);
        }        
    }
}
