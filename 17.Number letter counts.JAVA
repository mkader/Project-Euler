import java.io.*;
import java.util.*;

public class Solution {
    public void words() {
        int wordn1[]= new int[101];
        wordn1[1] = wordn1[2] = wordn1[6] = wordn1[10] = 3;
        wordn1[4] = wordn1[5] = wordn1[9] = 4;
        wordn1[3] = wordn1[7] = wordn1[8] = wordn1[40] =  wordn1[50] = wordn1[60] = 5;
        wordn1[11] = wordn1[12] = wordn1[20] = wordn1[30] = wordn1[80] = wordn1[90] = 6;
        wordn1[15] = wordn1[16] = wordn1[70] = 7;
        wordn1[13] = wordn1[14] = wordn1[18] = wordn1[19] = 8;
        wordn1[17] = 9;
        wordn1[100] =10;int tot = 0;
        for (int i =1;i<=1000;i++) {
            if (i<=100) {
                tot+=Less100(i, wordn1);
            } else if (i>100 && i<=999) {
                int id100 = i/100;
                int im100 = i%100;
                tot+=wordn1[id100] + 7;
                if (im100!=0) tot+=3;
                tot+=Less100(im100, wordn1);
            }
        }
        tot+="onethousand".length();
        System.out.println(tot);
    }
    
    public int Less100(int i, int[] wordn1) {
        int tot =0;
        if (i<=20) {
            tot+=wordn1[i];
        } else if (i>20 && i<=100) {
            int id = i/10;
            int im = i%10;
            if (im==0) {
                tot+=wordn1[id*10];
            } else {
            }
        }
        return tot;
    }
    
    public static void main(String[] args) {
        Solution p = new Solution();
        p.words();
    }
}
