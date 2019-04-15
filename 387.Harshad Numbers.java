A Harshad or Niven number is a number that is divisible by the sum of its digits. 
201 is a Harshad number because it is divisible by 3 (the sum of its digits.) 
When we truncate the last digit from 201, we get 20, which is a Harshad number. 
When we truncate the last digit from 20, we get 2, which is also a Harshad number. 
Let's call a Harshad number that, while recursively truncating the last digit, always results in a Harshad number a right truncatable Harshad number.

Also: 
201/3=67 which is prime. 
Let's call a Harshad number that, when divided by the sum of its digits, results in a prime a strong Harshad number.

Now take the number 2011 which is prime. 
When we truncate the last digit from it we get 201, a strong Harshad number that is also right truncatable. 
Let's call such primes strong, right truncatable Harshad primes.

You are given that the sum of the strong, right truncatable Harshad primes less than 10000 is 90619.

Find the sum of the strong, right truncatable Harshad primes less than 1014.

import java.math.BigInteger;
import java.util.Calendar;

public class Problem387 {
    //Using long, less then power 15
    long ebi = 10000L*10000L*10000*1000L;
    long tothn =0;
    boolean[] bprime = new boolean[10000000 + 1];
    int[] prime = new int[664579];

    private void primecal() {
        int currpos = 0;
        bprime[0] = bprime[1] = true;
        for (int i = 0; i < bprime.length; i++) {
            if (!bprime[i]) {
                prime[currpos++] = i;
                for (int j = 2 * i; j < bprime.length; j += i) {
                    bprime[j] = true;
                }
            }
        }
    }
    public void harshad() {
        primecal();

        for (int i=1;i<=9;i++)
            harshadprimenumber(i,i);
        System.out.println("totalothn );
    }

    private void harshadprimenumber(long sbi, int sum) {
        //System.out.println(sbi + "\t" + sum + "\t" +(sbi%sum));
        if (sbi%sum!=0 || sbi*10>ebi) return;
        if(isPrime(sbi/sum)) {
            for (long i=sbi*10+1;i<=sbi*10+9;i+=2){
                if (isPrime(i)) {
                    //System.out.println(i+"\t"+sum             tothn+=i;
                }
            }
        }

        for (int i=0;i<=9;i++)
            harshadprimenumber(sbi*10+i, sum+i);
    }

    private boolean isPrime(long n) {
        if (n < bprime.length) {
            return !bprime[(int) n];
        }
        int lim = (int) (Math.sqrt(n) + 1);
        for (int i = 0; i < prime.length; i++) {
            if (n % prime[i] == 0) {
                return false;
            } 

            if (prime[i] > lim) {
                return true;
            }
        }
        return true;
    }

    //Using long, more then power 15.
    BigInteger biebi = BigInteger.valueOf(10).pow(15);
    //52735 milliseconds
    BigInteger bitothn = BigInteger.ZERO;
    public void BIharshad() {
            for (int i=1;i<=9;i++)
            BIharshadprimenumber(BigInteger.valueOf(i),BigInteger.valueOf(i));
        System.out.println("totalitothn );
    }

    private void BIharshadprimenumber(BigInteger sbi, BigInteger sum) {

        if ((sbi.mod(sum)).compareTo(BigInteger.ZERO)!=0 || (sbi.multiply(BigInteger.valueOf(10)).compareTo(biebi)>0)) return;
        if(sbi.divide(sum).isProbablePrime(10000)) {
            for (BigInteger i=(sbi.multiply(BigInteger.valueOf(10))).add(BigInteger.ONE);i.compareTo((sbi.multiply(BigInteger.valueOf(10))).add(BigInteger.valueOf(9)))<=0;i=i.add(BigInteger.valueOf(2{
                if(i.isProbablePrime(10000)) {
                    //System.out.println("\t);
                    bitothn= bitothn.add(i);
                }
            }
        }

        for (int i=0;i<=9;i++)
            BIharshadprimenumber((sbi.multiply(BigInteger.valueOf(10))).add(BigInteger.valueOf(i)),sum.add(BigInteger.valueOf(i)));

    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        long start = 0, end=0;
        Problem387 p = new Problem387();

        start =(Calendar.getInstance()).getTimeInMillis();
        p.harshad ();
        end =(Calendar.getInstance()).getTimeInMillis();
        System.out.println(start + " - " + end  + " - " +(end-start));

        start =(Calendar.getInstance()).getTimeInMillis();
        p.BIharshad ();
        end =(Calendar.getInstance()).getTimeInMillis();
        System.out.println(start + " - " + end  + " - " +(end-start));

    }
}
