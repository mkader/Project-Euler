import java.io.*;
import java.util.*;

public class Solution {
    long bproduct =0;
    public void adjacent(String cd[]) {
        String[][] num = new String[20][20];
        for (int i =0 ;i<20;i++) {
            num[i] = cd[i].split("\\ ");
        }
            
        for (int i =0 ;i<20;i++) {
            for (int j =0 ;j<num[i].length;j++) {
                if (j<=16) calcuate(num[i][j],num[i][j+1],num[i][j+2],num[i][j+3]);
                if (i<=16)  calcuate(num[i][j],num[i+1][j],num[i+2][j],num[i+3][j]);
                if (i<=16 && j<=16)  calcuate(num[i][j],num[i+1][j+1],num[i+2][j+2],num[i+3][j+3]);
                if (i<=16 && j>=3) calcuate(num[i][j],num[i+1][j-1],num[i+2][j-2],num[i+3][j-3]);
            }
        }
        System.out.println(bproduct);
    }

    public long calcuate(String s1, String s2, String s3, String s4){
        long l = Integer.valueOf(s1) *  Integer.valueOf(s2) *  Integer.valueOf(s3) * Integer.valueOf(s4);
        //System.out.println(s1 + " " + s2 +" "+ s3+ " "+ s4 + " " + l + " " + bproduct);
        if (l>bproduct) bproduct  = l;
        return 0;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        String cd[] = new String[20];
        cd[0]= s.nextLine();
        int i=0;
        while(s.hasNext()) {
            cd[++i]= s.nextLine();
        }        
        p.adjacent(cd);
    }
}
