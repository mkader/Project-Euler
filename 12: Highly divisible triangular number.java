import java.io.*;
import java.util.*;

public class Solution {

	static Long[] tn = new Long[3073];
	public void triangle(int k) {
		tn[1] = 1l;
		tn[2] = 3l;
		tn[4] = 6l;
		tn[6] = 28l;
		tn[9] = 36l;
		tn[16] = 120l;
		tn[18] = 300l;
		tn[20] = 528l;
		tn[24] = 630l;
		tn[36] = 2016l;
		tn[40] = 3240l;
		tn[48] = 5460l;
		tn[90] = 25200l;
		tn[112] = 73920l;
		tn[128] = 157080l;
		tn[144] = 437580l;
		tn[162] = 749700l;
		tn[168] = 1385280l;
		tn[192] = 1493856l;
		tn[240] = 2031120l;
		tn[320] = 2162160l;
		tn[480] = 17907120l;
		tn[576] = 76576500l;
		tn[648] = 103672800l;
		tn[768] = 236215980l;
		tn[1024] = 842161320l;
		tn[1280] = 3090906000l;
		tn[1344] = 4819214400l;
		tn[1512] = 7589181600l;
		tn[1536] = 7966312200l;
		tn[1728] = 13674528000l;
		tn[1920] = 20366564400l;
		tn[2304] = 49172323200l;
		tn[2880] = 78091322400l;
		tn[3072] = 102774672000l;

		long tnv =tn[k];
		for (int i=k+1;k<=3072;k++) {
			if (tn[k]>tnv) {
				tnv = tn[k];
				break;
			}
		}
		System.out.println(tnv);
	}

	 public void triangleTest(int ik) {
	        int count = 0, tri =0;
	        int evalue = ik;
	        do {
	            tri = (evalue*(evalue+1))/2;
	            count = 0;
	            for (int i=(int)Math.sqrt(tri);i>=1;i--) {
	                if (tri%i==0){
						if (tri/i !=i) count+=2;
						else count+=1;
			   		}
	            }
	            evalue++;
	        }while(count<=ik);
	        System.out.println(tri);
    }

    public void trianglePre() {
        int max=1;
        for (long ik=2l;ik<453375l;ik++) {
            int count = 0;
            long evalue = ik;
            long tri = (evalue*(evalue+1))/2;
            for (long i=1;i<=Math.sqrt(tri);i++) {
            	if (tri%i==0){
					if (tri/i !=i) count+=2;
               		else count+=1;
		   		}
            }
            if (count>max) {
                System.out.println("tn.put("+count+", "+tri+"l);");
                max=count;
            }
        }
   }

    public static void main(String[] args) {
		Solution p = new Solution();
		//p.trianglePre();

		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		Arrays.fill(tn,0l);
		while(s.hasNext()) {
			int l = s.nextInt();
			if (l==1) System.out.println("3");
			else {
				//p.triangleTest(l);
				p.triangle(l);
			}
		}
    }
}

