import java.io.*;
import java.util.*;

public class Solution {
    public void Sundays(int fy, int fm, int fd, long sy, int sm, int sd) {
        long sun =0;
        //Calendar cal = Calendar.getInstance();
        for (long i=fy;i<=sy;i++) {
            int j=0,je=11;
            if(i==fy)j=fm-1;
            if(i==sy)je=sm-1;
            for (;j<=je;j++) {
                int k=1,ke=31;
                if(i==fy && j==fm-1) k=fd;
                if(i==sy && j==sm-1) ke=sd;
                if (k==1) {
                    Calendar cal =new  GregorianCalendar((int)i,j,1);
                    //cal.set((int)i,j,1);
                    if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
                        sun++;
                        //System.out.println((int)i + " " + i + " " + j + " " + k + " " + (cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY));
                    }
                }
            }
        }
        System.out.println(sun);
    }
    public static void main(String[] args) {
        Solution p = new Solution();
        //p.Sundays();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(s.hasNext()) {
            long fy =  s.nextLong();
            if(fy>1459990000 ) fy =fy%1459990000 ;
            int fm = s.nextInt();
            int fd = s.nextInt();
            long sy = s.nextLong();
            if(sy>1459990000 ) sy =sy%1459990000 ;
            int sm = s.nextInt();
            int sd = s.nextInt();
            //System.out.println(fy%1459990000  + " " + sy%1459990000  );
            p.Sundays((int)fy, fm, fd, (int)sy, sm, sd);
        }     
    }
}
/*
3
1988 3 25
1989 7 13
1924 6 6
1925 6 16
1000000000000 2 2
1000000001000 3 2
2015 2 1
2015 3 1
*/
