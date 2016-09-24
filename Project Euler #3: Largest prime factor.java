import java.io.*;
import java.util.*;

public class Solution {
    public void prime (long i) {
        for (long j=2; j<=Math.sqrt(i); j++) {
          long  n = i%j;
          if (n==0) {
              i = i/j;
              j=1;
          }
        }
        System.out.println(i);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        long l;
        while(s.hasNext()) {
            l = s.nextLong();
            p.prime(l);
        }        
    }
}
