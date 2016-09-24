import java.io.*;
import java.util.*;
import java.math.BigInteger;

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
    
    public void quadratic(int ik) {
        int maxp = 0, af=0,bf=0;
        for (int a=-999;a<ik;a++) {
            for (int b=-999;b<ik;b++) {
                int n=0;
                while(true){
                    long qf = n*n+n*a+b;
                    if (isPrime(Math.abs(qf))) {
                        n+=1;
                    } else {
                        if (n>maxp) {
                            maxp = n;
                            af=a;
                            bf=b;
                        }
                        break;
                    }
                }
            }
        }
        long mqf = maxp*maxp+maxp*af+bf;
        System.out.println(af + " " +bf);
        //System.out.println((af*bf));
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int k = s.nextInt();
        p.quadratic(k);
    }
}
