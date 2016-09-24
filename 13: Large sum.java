import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Solution {
    public void greatest(String cd[]) {
        BigInteger sum= BigInteger.ZERO;
        for (int i= 0; i < cd.length; i++) {
            sum= sum.add(new BigInteger(cd[i]));
            //System.out.println(sum);
        }
        //System.out.println(sum);
        System.out.println((sum.toString()).substring(0, 10));
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int k = s.nextInt();
        String cd[] = new String[k];
        s.nextLine();
        int i=0;
        while(s.hasNext()) {
            cd[i++]= s.nextLine();
        }        
        
        p.greatest(cd);
    }
}
