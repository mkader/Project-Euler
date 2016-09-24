import java.io.*;
import java.util.*;

public class Solution {
    public void palindromic(int l) {
        int hp = 0;
        for (int i=999;i>100;i--) {
            for (int j=i;j>100;j--) {
                    int ij =i * j;
                    int rij = 0, n= ij;
                    //System.out.println("Equals " + i + " - " + j + " - " + ij);
                    while(n>0){
                        rij=rij*10+n%10;
                        n=n/10;
                        //System.out.println("    Equals " + n + " - " + rij);
                    }
                    //if (ij<=hp)  break;
                    if (ij==rij ) {
                        if (ij<l && ij>hp) {
                            hp = ij;
                            //System.out.println("Equals " + i + " - " + j + " - " + ij);
                        }
                    }
                
            }
        }
        System.out.println(hp);
    }

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int l;
        while(s.hasNext()) {
            l = s.nextInt();
            p.palindromic(l);
        }        
    }
}
