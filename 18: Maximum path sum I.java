import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Solution {
    /*String cd[] = new String[] {
               "75",
             "95 64",
            "17 47 82",
           "18 35 87 10",
          "20 04 82 47 65",
         "19 01 23 75 03 34",
        "88 02 77 73 07 63 67",
       "99 65 04 28 06 16 70 92",
      "41 41 26 56 83 40 80 70 33",
     "41 48 72 33 47 32 37 16 94 29",
    "53 71 44 65 25 43 91 52 97 51 14",
   "70 11 33 28 77 73 17 78 39 68 17 57",
  "91 71 52 38 17 14 91 43 58 50 27 29 48",
 "63 66 04 68 89 53 67 30 73 16 69 87 40 31",
"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"};*/
    public static void adjacent1(int m, String[] cd) {
        String[][] num = new String[m][m];
        for (int i =0 ;i<m;i++) {
            num[i] = cd[i].split("\\ ");
        }
        for (int i =m-2 ;i>=0;i--) {
            for (int j=0 ;j<=i;j++) {
                int n = Integer.valueOf(num[i][j]);
                int f = Integer.valueOf(num[i+1][j]);
                int s = Integer.valueOf(num[i+1][j+1]);
                if (f>s) num[i][j]=(n+f)+"";
                else num[i][j]=(n+s)+"";
                //System.out.println(num[i][j]);
            }
        }
        /*for (int i =0 ;i<m;i++) {
            System.out.println(Arrays.toString(num[i]));
        }*/
        System.out.println(num[0][0]);
    }
    
    public static void main(String[] args) {
        Solution p = new Solution();
        //p.adjacent();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=0;i<n;i++) {
            int m = s.nextInt();
            //System.out.println(n+ " "+m);
            s.nextLine();
            String cd[] = new String[m];
            for (int j=0;j<m;j++) {
                cd[j]= s.nextLine();
                //System.out.println(Arrays.toString(cd));
                 //System.out.println(cd[j]);
            }
           
            p.adjacent1(m,cd);
        }
    }
}
