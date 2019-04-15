The proper divisors of a number are all the divisors excluding the number itself. For example, the proper divisors of 28 are 1, 2, 4, 7, and 14. As the sum of these divisors is equal to 28, we call it a perfect number.

Interestingly the sum of the proper divisors of 220 is 284 and the sum of the proper divisors of 284 is 220, forming a chain of two numbers. For this reason, 220 and 284 are called an amicable pair.

Perhaps less well known are longer chains. For example, starting with 12496, we form a chain of five numbers:

12496 → 14288 → 15472 → 14536 → 14264 (→ 12496 → ...)

Since this chain returns to its starting point, it is called an amicable chain.

Find the smallest member of the longest amicable chain with no element exceeding one million.

14316    2,7158,3,4772,4,3579,6,2386,12,1193,    19116
19116    2,9558,3,6372,4,4779,6,3186,9,2124,12,1593,18,1062,27,708,36,531,54,354,59,324,81,236,108,177,118,162,    31704
31704    2,15852,3,10568,4,7926,6,5284,8,3963,12,2642,24,1321,    47616
47616    2,23808,3,15872,4,11904,6,7936,8,5952,12,3968,16,2976,24,1984,31,1536,32,1488,48,992,62,768,64,744,93,512,96,496,124,384,128,372,186,256,192,248,    83328
83328    2,41664,3,27776,4,20832,6,13888,7,11904,8,10416,12,6944,14,5952,16,5208,21,3968,24,3472,28,2976,31,2688,32,2604,42,1984,48,1736,56,1488,62,1344,64,1302,84,992,93,896,96,868,112,744,124,672,128,651,168,496,186,448,192,434,217,384,224,372,248,336,    177792
177792    2,88896,3,59264,4,44448,6,29632,8,22224,12,14816,16,11112,24,7408,32,5556,48,3704,64,2778,96,1852,128,1389,192,926,384,463,    295488
295488    2,147744,3,98496,4,73872,6,49248,8,36936,9,32832,12,24624,16,18468,18,16416,19,15552,24,12312,27,10944,32,9234,36,8208,38,7776,48,6156,54,5472,57,5184,64,4617,72,4104,76,3888,81,3648,96,3078,108,2736,114,2592,144,2052,152,1944,162,1824,171,1728,192,1539,216,1368,228,1296,243,1216,288,1026,304,972,324,912,342,864,432,684,456,648,486,608,513,576,    629072
629072    2,314536,4,157268,8,78634,16,39317,    589786
589786    2,294893,    294896
294896    2,147448,4,73724,7,42128,8,36862,14,21064,16,18431,28,10532,56,5266,112,2633,    358336
358336    2,179168,4,89584,8,44792,11,32576,16,22396,22,16288,32,11198,44,8144,64,5599,88,4072,176,2036,352,1018,509,704,    418904
418904    2,209452,4,104726,8,52363,    366556
366556    2,183278,4,91639,    274924
274924    2,137462,4,68731,13,21148,17,16172,26,10574,34,8086,52,5287,68,4043,221,1244,311,884,442,622,    275444
275444    2,137722,4,68861,13,21188,26,10594,52,5297,    243760
243760    2,121880,4,60940,5,48752,8,30470,10,24376,11,22160,16,15235,20,12188,22,11080,40,6094,44,5540,55,4432,80,3047,88,2770,110,2216,176,1385,220,1108,277,880,440,554,    376736
376736    2,188368,4,94184,8,47092,16,23546,32,11773,61,6176,122,3088,193,1952,244,1544,386,976,488,772,    381028
381028    2,190514,4,95257,    285778
285778    2,142889,43,6646,86,3323,    152990
152990    2,76495,5,30598,10,15299,    122410
122410    2,61205,5,24482,10,12241,    97946
97946    2,48973,    48976
48976    2,24488,4,12244,8,6122,16,3061,    45946
45946    2,22973,    22976
22976    2,11488,4,5744,8,2872,16,1436,32,718,64,359,    22744
22744    2,11372,4,5686,8,2843,    19916
19916    2,9958,4,4979,13,1532,26,766,52,383,    17716
17716    2,8858,4,4429,43,412,86,206,103,172,    14316


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class Problem95 {
    public void chain() {
        int ac[] = new int[1000000];
        Arrays.fill(ac, -1);
        //1000000 - 3838 milli seconds
        int lc =0,lcc=0,tlcc=0,tlc=0;
        int i = 1    ;
        while(i<1000000){
            if(ac[i]!=0) {
            lcc=0;
            int si =0,ie=i;
            //System.out.println(i);
            ArrayList<Integer> ar = new ArrayList<Integer>();
            while(true){
                int s = (int)Math.sqrt(ie);
                si=1;
                for (int j =2 ;j<=s;j++){
                    if(ie%j==0) {
                        si+=j;
                        if (j!=(ie/j)) {
                            si+=ie/j;
                        }
                    }
                }
                if(i==si) {
                    ac[i]=1;
                   for(int a=0;a<ar.size();a++) 
                       ac[a]=1;
                   lcc++;

                   if(lcc>tlcc) {
                       tlcc=lcc;
                       tlc=i;
                       //if ()
                       System.out.println(" NAC " +i + " - " + lcc);
                   } //else
                       //System.out.println(" AC " +i + " - " + lcc);
                   break;
               } else if(si>=1000000) {
                   ac[i]=0;
                   for(int a=0;a<ar.size()-1;a++){ 
                          ac[ar.get(a)]=0;
                   }
                   break;
               }else if(ac[si]==0 || ar.contains(si)) {
                   ac[i]=0;
                   break;
               }else {
                   ar.add(si);
                   lcc++;
                   ie=si;
                   si =0;
               }
            }
        }
            i++;
        }
        System.out.println(tlcc);
    }

    public static void main(String[] args) {

        long start = 0, end=0;
        Problem95 p = new Problem95();

        start =(Calendar.getInstance()).getTimeInMillis();
        p.chain();
        end =(Calendar.getInstance()).getTimeInMillis();
        System.out.println(start + " - " + end  + " - " +(end-start));
    }
}
