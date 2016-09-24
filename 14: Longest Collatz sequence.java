import java.io.*;
import java.util.*;

public class Solution {
    public static long chain[] = new long[1000000];
       
    public void iterative() {
       long maxcount = 0, maxnumber = 1;
       int evalue = 1000000;
       boolean usedChain[] = new boolean[chain.length];
       Arrays.fill(usedChain, false);
       chain[1]=1;
       chain[2]=2;
       usedChain[1]=true;
       usedChain[2]=true;
       for (int i=3;i<evalue;i++) {
              //int i =1819;
           long k =i, count=1;
           while (k>1) {
               count++;
               if (k%2==0)
                   k=k/2;
               else
                   k=3*k+1;

               if (k<1000000) {
                   if (usedChain[(int) k]) {
                       count = count+chain[(int) k]-1;
                       break;
                   }
               }
           }
           if (count>maxcount) {
               maxcount = count;
               maxnumber = i;
           }
           chain[i]=count;
       }
       //System.out.println(maxnumber);
        //System.out.println(Arrays.toString(chain));
    }
    
    public static void main(String[] args) {
        Solution p = new Solution();
        p.iterative();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(s.hasNext()) {
            int l = s.nextInt();
            long max=0,ip=0;
           //System.out.println(" " + l);
            for(int i=1;i<=l;i++) {
               // System.out.println(chain[i] + " " + i);
                if(chain[i]>=max){
                    max=chain[i];
                    ip=i;
                }
            }
            System.out.println(ip);
        }     
    }
}
