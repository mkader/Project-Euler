import java.io.*;
import java.util.*;

public class Solution {
    
    //public static  int[] tn = new int[100000]; 
    public static Map<Integer,Integer> tn = new HashMap<Integer,Integer>();
    
    public void triangle(int ik) {
        int count = 0, tri =0;
        int evalue = ik;
        do {
            tri = (evalue*(evalue+1))/2;
            count = 0;
            for (int i=(int)Math.sqrt(tri);i>=1;i--) {
                //System.out.println(tri + " "+Math.sqrt(tri)+ " " +i + " " + (tri%i==0));
                if (tri%i==0) count+=2;
            }
            evalue++;
        }while(count<=ik);
        //System.out.println("Test " + ik + "= " +tri);
        System.out.println(tri);
    }

    
    public void triangleTest(int ik) {
        int count = 0, tri =0;
        int evalue = ik;
        //System.out.println("");
        //System.out.println(ik + " " + tn.get(evalue)) ;
        do {
            if (tn.get(evalue)==null || tn.get(evalue)==0){
                tri = (evalue*(evalue+1))/2;
                //System.out.println(evalue + " e,tn[e] " +  tn.get(evalue));
                count = 0;
                for (int i=1;i<=Math.sqrt(tri);i++) {
                    //System.out.println(" "+Math.sqrt(tri)+ " " +i + " " + (tri%i==0));
                    if (tri%i==0) count+=2;
                }
                tn.put(evalue, count);
                //System.out.println(tri + " " + count + " c=t[e] "+ evalue);
                evalue++;
            } else {
                count = tn.get(evalue);    
                //tri = (evalue*(evalue+1))/2;
                //System.out.println(tri + " " + count + " c=t[e] "+ evalue + ",");
                evalue++;
            }
        }while(count<=ik);
        if(tri==0) tri = (evalue*(evalue-1))/2;
        System.out.println(tri);
   }
   
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        //p.triangle();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int l;
        //Arrays.fill(tn,0);
        //tn[1]=3;
        while(s.hasNext()) {
            l = s.nextInt();
            if (l==1) System.out.println("3");
            else {
                p.triangleTest(l);
                p.triangle(l);
            }
        }       
        //System.out.println(Arrays.toString(tn));
    }
}
