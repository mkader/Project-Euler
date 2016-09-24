import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    
    public boolean[] perfect() {
        int sum =0, tot=0, evalue=100000;
        boolean[] ab = new boolean[evalue+1];
        Arrays.fill(ab, true);
        boolean[] sab = new boolean[evalue+1];
        Arrays.fill(ab, false);
        for (int j=1;j<=evalue;j++){
            sum =1;
            int s = (int)Math.sqrt(j);
            for (int i =2 ;i<=s;i++) {
                if(j%i==0) {
                    sum += i + j / i;
                }
            }
            if (s * s == j) sum -= s;
            if(sum>j) {
                ab[j]=true;
            }
        }

        for (int j=0;j<ab.length;j++){
            if (ab[j]) {
                for (int i=j;i<ab.length;i++){
                    if (ab[i]) {
                        int tot1 = i + j;
                        if (tot1<=evalue) {
                            sab[tot1]=true;
                        } else  {
                            break;
                        }
                    }
                }
            }
        }
        /*for (int j=1;j<=evalue;j++){
            System.out.println(sab[j] + " " + j);
            if(!sab[j]) {
                tot+=j;
            }
        }*/
        //System.out.println(sab[evalue]?"YES":"NO");
        return sab;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        boolean[] sab =p.perfect();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int l;
        while(s.hasNext()) {
            l = s.nextInt();
            //p.perfect(l);
            System.out.println(sab[l]?"YES":"NO");
        }        
    }
}
