Consider all integer combinations of ab for 2 ≤ a ≤ 5 and 2 ≤ b ≤ 5:

22=4, 23=8, 24=16, 25=32
32=9, 33=27, 34=81, 35=243
42=16, 43=64, 44=256, 45=1024
52=25, 53=125, 54=625, 55=3125
If they are then placed in numerical order, with any repeats removed, we get the following sequence of 15 distinct terms:

4, 8, 9, 16, 25, 27, 32, 64, 81, 125, 243, 256, 625, 1024, 3125

How many distinct terms are in the sequence generated by ab for 2 ≤ a ≤ 100 and 2 ≤ b ≤ 100?

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem29 {
    public void distinct  () {
        int is = 2, ie=100;
        List<BigInteger> list = new ArrayList<BigInteger>();
        for (int i=is;i<=ie;i++){
            for (int j=is;j<=ie;j++){
                BigInteger ij = BigInteger.valueOf(i).pow(j);
                if (!list.contains(ij)){
                    list.add(ij);
                }
            }
        }
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        Problem29 p = new Problem29();
        p.distinct  ();
    }
}
