import java.io.*;
import java.util.*;

public class Solution {

    public static ArrayList<String> lp = new ArrayList<String>();
    public static void permutation(String str) { 
        permutation("", str); 
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) lp.add(prefix);//System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
    public long Fact(long n){
        if (n==1) return n;
        return n*Fact(n-1);
        
    }
    
    public String GeneratePermutation(long n, String s) {
        ArrayList<Character> al = new ArrayList<Character>();
        for (char c : s.toCharArray())  al.add(c);
 
        long d=1;
        long ff= 0;
        String nlp = "";
        for (long i=s.length();i>=2;i--){
            long f = Fact(i-1);
            int nfd=(int)Math.ceil(n/(double)f);
            //n=(n/f)-((d-1)*(i*ff))
            nlp+=al.get(nfd-1);
            //System.out.println(i + ","+f + ","+ nfd+","+nlp + ",n="+n);
            al.remove(nfd-1);
            n=n-(nfd-1)*f;
        }
        nlp+=al.get(0);
        //System.out.println(nlp);
        return nlp;
        /*5(4!)+4(3!)+3(2!)+2(1!)+1(0!)

        5*24=(105/24) = (4.375)=>5 = 5 (12345)
        4*6 =(105-(5-1=>4*24)96=9/6) = (1.5)=>2 = 52 (1234)
        3*2 =(105-96-(2-1=>1*6)6=3/2) = (1.5)=>2 = 523 (134)
        2*1 =(105-96-6-(2-1=>1*2)2=1/1) = (1)=>1 = 5231 (14)
        1 => 52314

        5*24=24/24 = 1=>1 = 1 (12345)
        4*6 =(24-(1-1=>0*24)0=24/6) = (4)=>4 = 15(2345)
        3*2 =(24-0-(4-1=>3*6)18=6/2) = (3)=>3 = 154 (234)
        2*1 =(24-0-18-(3-1=>2*2)4=2/1) = (2)=>2 = 1543 (23)
        1*1 => 15432*/
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        String str ="abcdefghijklm";
        while(s.hasNext()) {
            int l = s.nextInt();
            System.out.println(p.GeneratePermutation(l,str));
        }
        /*String str="12345";
        s.permutation(str); 
        Random rand = new Random();
        long f = s.Fact(str.length());
        for (int i=0;i<=10;i++) {
            int  n = rand.nextInt((int)f);
            System.out.println(f +","+n + ",GP="+s.GeneratePermutation(n,str) + ",LP="+lp.get(n-1) + " = " +(s.GeneratePermutation(n,str).equals(lp.get(n-1))));
        }*/
        
    }
}
