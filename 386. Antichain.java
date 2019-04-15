Let n be an integer and S(n) be the set of factors of n.

A subset A of S(n) is called an antichain of S(n) if A contains only one element or if none of the elements of A divides any of the other elements of A.

For example: S(30) = {1, 2, 3, 5, 6, 10, 15, 30} 
{2, 5, 6} is not an antichain of S(30). 
{2, 3, 5} is an antichain of S(30).

Let N(n) be the maximum length of an antichain of S(n).

Find ΣN(n) for 1 ≤ n ≤ 108

import java.util.Calendar;

public class Problem386 {
    int sv=2, ev = 100000000;
    boolean pvalue[] = new boolean[ev+1];    

    public  int[] largestPrimeFactorSieve(int n) {
      int[] largestPrime = new int[n];
      for (int i = 2; i < largestPrime.length; ++i) largestPrime[i] = i;
      for (int p = 2; p*p < largestPrime.length; ++p) {
          if (largestPrime[p] == p) {
              for (int i = 2*p; i < largestPrime.length; i += p)  {
                  if (largestPrime[i]/p!=1) {
                      largestPrime[i] /= p;
                      while (largestPrime[i]%p == 0)
                          largestPrime[i] /= p;
                      if (largestPrime[i] == 1) 
                          largestPrime[i] = p;
                 }
              }
          }
      }
      return largestPrime;
    }

    public void antichain3(){
        long num[] = new long[ev + 1];
        long count=1;
        int[] lpf = largestPrimeFactorSieve(ev + 1);
        for(int i=2; i < num.length; i++) {
             int n1= i, c=0;
             while(n1>1) {
                  n1 = n1/lpf[n1]; 
                  c++;
             }
             if(c==1) count++;
             num[i]=c;
        }
        for(int i=2; i < num.length/2; i++) {
            for(int j=2*i; j < num.length; j+=i) {
                if(num[i] == num[j]/2) {
                    count++;
                }
            }
        }
        System.out.println("" + count);
    }

    public static void main(String[] args) {
        long start = 0, end=0;
        Problem386 p = new Problem386();

        start =(Calendar.getInstance()).getTimeInMillis();
        p.antichain3();
        end =(Calendar.getInstance()).getTimeInMillis();
        System.out.println(start + " - " + end  + " - " +(end-start));
    }
}


No.	Prime	C	C/2	1	2	3	4	5	6	7	8	9	#			T
1	1	1	0	1												1
2	2	1	0	1												1
3	3	1	0	1												1
4	2,2	2	1		1									2,4	2	1
5	5	1	0	1												1
6	3,2	2	1		1	1								2,3,6	2,3	2
7	7	1	0	1												1
8	2,2,2	3	1		1		N						2,4,8	2	1
9	3,3	2	1			1								3,9	3	1
10	2,5	2	1		1			1						2,5,10	2,5	2
11	11	1	0	1												1
12	2,2,3	3	1		1	1	N	N				2,3,4,6,12	2,3	2
13	13	1	0	1												1
14	2,7	2	1		1					1				2,7,14	2,7	2
15	3,5	2	1			1		1						3,5,15	3,5	2
16	2,2,2,2	4	2		N	1							2,4,8,16	2	1
17	17	1	0	1							N				1
18	2,3,3	3	1		1	1			N				2,3,6,9,18	2,3	2
19	19	1	0	1								N			1
20	2,2,5	3	1		1		N	1					N	2,4,5,10.20	2,5	2
9	8	5	1	3	0	1	0	0	0			27
