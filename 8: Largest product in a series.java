import java.io.*;
import java.util.*;

public class Solution {
    public void greatest(int K, String cdm) {
        long gp =0;
        //String cdm = "3675356291";
        for(int j=0;j<cdm.length()-K;j++){
            String scdm = "";
            long lcdm = 1;
            
            for(int k=j;k<j+K;k++){
                scdm += cdm.charAt(k);
                lcdm = lcdm * Long.valueOf(cdm.charAt(k)+"");
            }
            if (lcdm>gp) gp = lcdm;
            //System.out.println(scdm + " - " + lcdm + " " + gp);
        }
        System.out.println(gp);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        while(s.hasNext()) {
            int N = s.nextInt();
            int K = s.nextInt();
            s.hasNext();
            String d = s.next();
            //System.out.println(N + " " + K+ " " + d);
            p.greatest(K, d);
        }        
    }
}
