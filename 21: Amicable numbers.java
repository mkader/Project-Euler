import java.io.*;
import java.util.*;

public class Solution {
    
    public void AmicableNumbers(int k) {
		int an[] = new int[] {220,284,1184,1210,2620,2924,5020,5564,6232,6368,10744,10856,12285,14595,17296,18416,63020,76084,66928,66992,67095,71145,69615,87633,79750,88730,100485,124155,122265,139815,122368,123152,141664,153176,142310,168730,171856,176336,176272,180848,185368,203432,196724,202444,280540,365084,308620,389924,319550,430402,356408,399592,437456,455344,469028,486178,503056,514736,522405,525915,600392,669688,609928,686072,624184,691256,635624,712216,643336,652664,667964,783556,726104,796696,802725,863835,879712,901424,898216,980984,947835,998104};
		//System.out.println(an.length);
		long sum =0;
		for (int i=0;i<an.length;i++) if(an[i]<=k)sum+=an[i];
		System.out.println(sum);
	}
    public void GetAmicableNumbers(int k) {
		ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i=2;i<=k;i++){
            int b = SumOfProperDivisors(i);
            if (SumOfProperDivisors(b)==i && b!=i) {
				if(!al.contains(i)) al.add(i);
				if(!al.contains(b) && b<=k) al.add(b);
            }
        }
        //System.out.println(al.size());
        /*for (int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}*/
    }

    public int SumOfProperDivisors(int n) {
        int sum=1;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0 && (n/i!=i) ){
                sum+=i+(n/i);
                //System.out.println(i+","+ n/i);
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution p = new Solution();
        //p.amicablePE(100000);
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int l;
        while(s.hasNext()) {
            l = s.nextInt();
            //p.GetAmicableNumbers(l);
            p.AmicableNumbers(l);
        }
    }
}
