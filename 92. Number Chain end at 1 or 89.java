A number chain is created by continuously adding the square of the digits in a number to form a new number until it has been seen before.

For example,

44 → 32 → 13 → 10 → 1 → 1
85 → 89 → 145 → 42 → 20 → 4 → 16 → 37 → 58 → 89

Therefore any chain that arrives at 1 or 89 will become stuck in an endless loop. What is most amazing is that EVERY starting number will eventually arrive at 1 or 89.

How many starting numbers below ten million will arrive at 89?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

//611 - 8581146
public class Problem92 {
    int tbia[] = new int[10000000];
    public void chain() {
        int count=0;
        int sq[] = new int[10];
        
        for(int i=0;i<=9;i++) sq[i]=i*i;
          
          Arrays.fill(tbia, -1);
          tbia[89]=1;
           ArrayList<Integer> bia;
           int i = 1;
           while(i<10000000){
               if (tbia[i]==1) {
                   count++;
               }else{
                   bia = new ArrayList<Integer>();
                   bia.add(i);
                   int i1=i;
                   while(true) {
                       int sui=0;
                       while(i1 > 0){
                            int d = i1%10;
                            sui+=sq[d];
                            i1/=10;
                        }
                      if (tbia[sui]==1) {
                           Add01(1, bia);
                           count++;
                           break;
                       } else if (tbia[sui]==0 || bia.contains(sui)) {
                           Add01(0, bia);
                           break;
                       } else {
                           i1=sui;
                           bia.add(sui);
                       }
                   }
               }
               i++;
           }
           System.out.println(count + " - " + i);
    }
    
    public void Add01(int a01, ArrayList<Integer> bia){
        for(int b=0;b<bia.size();b++){
               tbia[bia.get(b)]=a01;
           }
    }
    public static void main(String[] args) {
        
        long start = 0, end=0;
        
        Problem92 p = new Problem92();
        
        start =(Calendar.getInstance()).getTimeInMillis();
        p.chain();
        end =(Calendar.getInstance()).getTimeInMillis();
        System.out.println(start + " - " + end  + " - " +(end-start));
    }

}        
