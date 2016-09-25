import java.io.*;
import java.util.*;

public class Solution {
    public void PEOrginial() {
        String ss = "";
        try {
            Scanner scanner = new Scanner(new FileInputStream("names.txt"));
            ss = scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        String num[] = ss.split("\\,");
        Arrays.sort(num);
        int sum = 0;
        for (int i =0 ;i<num.length;i++) {
            int n =0;
                String name = num[i];
                for (int j =1 ;j<name.length()-1;j++) {
                    n+=(name.charAt(j)-64);
                }
                sum+=n*(i+1);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Solution p = new Solution();
        //p.PEOrginial();
        
        Map<String, Integer[]> m = new HashMap<String,  Integer[]>();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        String names[]= new String[n];
        for(int i=0;i<n;i++) {
            names[i]=s.next();
        }
        Arrays.sort(names);
        for(int i=0;i<n;i++) {
            int sum = 0;
            for (int j =0 ;j<names[i].length();j++) {
                sum+=(names[i].charAt(j)-64);
            }
            //System.out.println(names[i] + " " + sum);
            m.put(names[i], new Integer[]{i,sum});
        }
        int q = s.nextInt();
        for(int i=0;i<q;i++) {
            String qn=s.next();
            if (m.get(qn)!=null) {
                Integer[] qnv= m.get(qn);
                //System.out.println(qn+ " " + qnv[0]+ " "+ qnv[1] + " "+   ((qnv[0]+1)*qnv[1]));
                System.out.println(((qnv[0]+1)*qnv[1]));
            }
            else {
                System.out.println(0);
            }
        }
      
    }
    
    
}
