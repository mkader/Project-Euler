import java.io.*;
import java.util.*;

public class Solution {
    public boolean isPrime(long n) {
        if(n==1) 
            return false;
        else if (n<4)
            return true; //2 and 3 are prime
        else if (n%2==0)
            return false;
        else if (n<9)
            return true; //we have already excluded 4,6 and 8.
        else if (n%3==0)
            return false;
        else {
            double r=Math.floor(Math.sqrt(n)); // n rounded to the greatest integer r so that r*r<=n
            double f=5;
            while(f<=r) {
                if (n%f==0)
                        return false;// (and step out of the function)
                if (n %(f+2)==0) 
                    return false; //(and step out of the function)
                f=f+6;
            }
        }
        return true; //(in all other cases)
    }
    
    public void smallestPE(long evalue) {
        long n = 1, sm=1;//, evalue=10;
        for (long i=2;i<=evalue;i++) {
            if (isPrime(i)) {
                if (i<= Math.sqrt(evalue)) {
                    double pf = Math.floor(Math.log(evalue)/Math.log(i));
                    sm*=Math.pow(i, pf);
                    //System.out.println(i + " - " + pf + " - "+ Math.pow(i, pf));
                } else {
                    sm*=i;
                }
            }
        }
        System.out.println(sm);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        long l;
        while(s.hasNext()) {
            l = s.nextLong();
            p.smallestPE(l);
        }        
    }
}
