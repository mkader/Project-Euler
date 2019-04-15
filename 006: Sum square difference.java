import java.io.*;
import java.util.*;

public class Solution {
    
    public void differencePE(long n) {
        long sum = 0, sumt=0;//, n=3;
        long sn = n *(n + 1)/2; 
        long snsqrt = (2*n+1)*(n+1)* n/6;
        sn = sn*sn;
        long dif = sn-snsqrt;
        System.out.println(dif);
        //System.out.println(sn + " - " + snsqrt + " - " + dif);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        long l;
        while(s.hasNext()) {
            l = s.nextLong();
            p.differencePE(l);
        }        
    }
}
