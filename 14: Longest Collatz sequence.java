import java.io.*;
import java.util.*;

public class S {

    public static Map<Integer, Integer> m;

    public void iterativePre(long l) {
		long evalue = l;
		long max=0;
		long maxi=0;
		m.put(1,1);
		m.put(2,2);
        for (long i=3;i<=evalue;i++) {
			if (m.get(i)==null) {
				long k =i, count=0;
				while (k>1) {
					count++;
					if (k%2==0)
						k=k/2;
					else
						k=3*k+1;
					if (m.get(k)!=null) {
						count+=m.get(k);
						break;
					}
				}
				if (count>=max) {
					//System.out.println("m[" +i+ "]= " + count + ";");
					max=count;
					maxi=i;
				}
			}
		}
    }

    public void PreCompute() {
        m.put(1, 1);
		m.put(2, 2);
		m.put(3, 8);
		m.put(6, 9);
		m.put(7, 17);
		m.put(9, 20);
		m.put(18, 21);
		m.put(19, 21);
		m.put(25, 24);
		m.put(27, 112);
		m.put(54, 113);
		m.put(55, 113);
		m.put(73, 116);
		m.put(97, 119);
		m.put(129, 122);
		m.put(171, 125);
		m.put(231, 128);
		m.put(235, 128);
		m.put(313, 131);
		m.put(327, 144);
		m.put(649, 145);
		m.put(654, 145);
		m.put(655, 145);
		m.put(667, 145);
		m.put(703, 171);
		m.put(871, 179);
		m.put(1161, 182);
		m.put(2223, 183);
		m.put(2322, 183);
		m.put(2323, 183);
		m.put(2463, 209);
		m.put(2919, 217);
		m.put(3711, 238);
		m.put(6171, 262);
		m.put(10971, 268);
		m.put(13255, 276);
		m.put(17647, 279);
		m.put(17673, 279);
		m.put(23529, 282);
		m.put(26623, 308);
		m.put(34239, 311);
		m.put(35497, 311);
		m.put(35655, 324);
		m.put(52527, 340);
		m.put(77031, 351);
		m.put(106239, 354);
		m.put(142587, 375);
		m.put(156159, 383);
		m.put(216367, 386);
		m.put(230631, 443);
		m.put(410011, 449);
		m.put(511935, 470);
		m.put(626331, 509);
		m.put(837799, 525);
		m.put(1117065, 528);
		m.put(1126015, 528);
		m.put(1501353, 531);
		m.put(1564063, 531);
		m.put(1723519, 557);
		m.put(2298025, 560);
		m.put(3064033, 563);
		m.put(3542887, 584);
		m.put(3732423, 597);

		String smk ="{";
		String smv ="{";
		for (Map.Entry<Integer, Integer> e : m.entrySet()) {
			Integer ak = e.getKey();
			Integer av = e.getValue();
			smk+=ak+",";
			smv+=av+",";
		}
		smk +="}";
		smv +="}";
		System.out.println(smk);
		System.out.println(smv);
	}

    public static void main(String[] args) {
        S p = new S();
        //m = new HashMap<Integer, Integer>();
        //p.iterativePre(5000000);
        //p.PreCompute();
        int[] mk = new int[]{1,129,2,3,6,7,1564063,9,649,1161,17673,2298025,654,655,18,2322,626331,19,2323,1117065,25,27,667,6171,410011,2463,35497,171,837799,216367,2223,52527,54,55,511935,313,703,34239,1501353,327,13255,35655,73,3064033,3542887,10971,97,230631,1723519,77031,231,871,2919,23529,235,1126015,17647,142587,156159,106239,3711,26623,3732423};
		int[] mv = new int[]{1,122,2,8,9,17,531,20,145,182,279,560,145,145,21,183,509,21,183,528,24,112,145,262,449,209,311,125,525,386,183,340,113,113,470,131,171,311,531,144,276,324,116,563,584,268,119,443,557,351,128,179,217,282,128,528,279,375,383,354,238,308,597};
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ki=0, vi=0, fk=0;
		while(s.hasNext()) {
			int l = s.nextInt();
			ki=0;
			vi=0;
			fk=0;
			for (int i=1;i<mk.length;i++) {
				if (mk[i]>=ki && mk[i]<=l) {
					ki =mk[i];
					if (mv[i]>=vi) {
						vi=mv[i];
						fk=ki;
					}
				}
			}
			System.out.println(fk);
	    }
    }
}
/*
 3
10
15
20
Sample Output

9
9
19
*/
