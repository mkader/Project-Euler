import java.io.*;
import java.util.*;

public class Solution {
    public boolean[] primePE() {
        long l=100000000l;
        int cl = (int)Math.sqrt((double)l);
        boolean s[] = new boolean[(int)(l+1)];
        Arrays.fill(s, false);
        for (int i=4;i<=l;i=i+2) {
            s[i]=true;
        }
        for (int i=3;i<=cl;i=i+2) {
            if (!s[i]) {
                for (int j=i*i;j<=l;j=j+(2*i)) {
                    s[j]=true;
                }
            }
        }
        return s;
    }
    
    public void findLastPrime(boolean s[], long limit) {   
        int count = 0, lastp=1;
        for (int i=2;i<=s.length;i++){
            if(!s[i]) {
                count++;
                //System.out.println(i + "  " + count);
                if (count==limit) {
                    lastp= i;
                    //System.out.println(i);
                    break;
                }
            }
        }
        System.out.println(lastp);
    }

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
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        boolean primes[] = p.primePE();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        long l;
        while(s.hasNext()) {
            l = s.nextLong();
            p.findLastPrime(primes, l);
        }        
    }
}
