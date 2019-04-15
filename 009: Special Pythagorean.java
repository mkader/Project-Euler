import java.io.*;
import java.util.*;

public class Solution {
     //greatest common divisor
    public long gcd(long a, long b) {
       if (b==0) return a;
       return gcd(b,a%b);
    }
    
    public void PythagoreanPE(long evalue) {
        //long evalue =1000;
        long fv = -1;
        for (long i=3;i<=(evalue-3)/3;i++) {
            for (long j=i+1;j<=(evalue-1-i)/2;j++) {
                long k = evalue-i-j;
                if ((i*i+j*j)==(k*k)) {
                    //System.out.println(i+ " - " + j + " - " + k + " - " );
                    fv= i*j*k;
                    //System.out.println(fv);
                    break;
                }
            }
        }
        System.out.println(fv);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        long l;
        while(s.hasNext()) {
            l = s.nextLong();
            p.PythagoreanPE(l);
        }        
    }
}
