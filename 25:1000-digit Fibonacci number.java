/*

The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn-1 + Fn-2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

Binet's Fibonacci formula
http://www.had2know.com/academics/number-digits-length-fibonacci-number.html
golden section
Q = [1+sqrt(5)]/2 =1.618

sqrt(5) = 2.2360
((1+sqrt(5))**n - (1-sqrt(5))**n)/ (2**n*sqrt(5))


n=1= ((1+2.2360)**1-(1-2.2360)**1)/(2**1*(2.2360))=>(3.236-(-1.236))/4.472 	=>	1
n=2= ((1+2.2360)**2-(1-2.2360)**2)/(2**2*(2.2360))=>(10.471-1.527)/9.944	=>	1
n=3= (3.2360**3-(-1.2360**3)/(2**3*(2.2360))=>(33.886-(-1.888))/17.888	=>	1.99
n=4= (3.2360**4-(-1.2360**4)/(2**4*(2.2360))=>(109.656-2.333)/35.776	=>	2.99
n=5= 354.848-(-2.884)/71.552	=>	4.99
n=5= 114.288-3.565/143.104	=>	7.99

Length of a Fibonacci Number
log10(Q) = log1o(1.1618)= 0.208979
(-log10(5)/2+1) = > -log10(5)/2+1=>-0.3449+1=>0.650515
L(N) = n.log10(Q) - log10(5)/2+1

n=1=>1.0.208979-0.650515 = 0.859494
n=2=>2.0.208979-0.650515 = 1.068473
n=3=>3.0.208979-0.650515 = 1.277452
n=4=>4.0.208979-0.650515 = 1.486431
n=5=>5.0.208979-0.650515 = 1.69541
n=6=>6.0.208979-0.650515 = 1.904389
n=7=>7.0.208979-0.650515 = 2.113368
n=8=>8.0.208979-0.650515 = 2.322347
n=9=>9.0.208979-0.650515 = 2.531326
n=10>10.0.208979-0.650515 = 2.740305
n=11=> 2.949284
n=12=> 3.158263
n=13=> 3.367242
n=14=> 3.576221
n=15=>3.7852
n=16=>3.994179
n=17=>4.203158
n=18=>4.412137
n=19=>4.621116
n=20=>4.830095
n=21=>5.039074

*/

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

	public void BinetLengthFibonacci (int ln) {
		int n =2;
		double q = Math.log10((1+Math.sqrt(5))/2);
		double f = 1-Math.log10(5)/2;
		//System.out.println(q +","+ f);
	   	while (true) {
			double l = n*q+f;
			//long w = (long)l;
			if ((int)l==ln) break;
			//System.out.println(n+"\t"+w+"\t"+l);
			n++;
		}
		System.out.println(n);
    }

	//Time out
    public void Fibonacci (int ik) {
        final String bignumber = BigInteger.valueOf(10).pow(ik).toString(10);
        //System.out.println(bignumber  + " - "+ bignumber.length());
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger c = a.add(b);
        int count = 3;
        String chekc = c.toString(10);
        while (true) {
            a =b.add(c);
            chekc = a.toString(10);
            count++;
            if (chekc.length() >= bignumber.length()) break;

            b =c.add(a);
            chekc = b.toString(10);
            count++;
            if (chekc.length() >= bignumber.length()) break;

            c =a.add(b);
            count++;
            chekc = c.toString(10);
            if (chekc.length() >= bignumber.length()) break;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int l;
        //5000
        while(s.hasNext()) {
            l = s.nextInt();
            //p.Fibonacci(l-1);
            p.BinetLengthFibonacci(l);
        }
    }
}
