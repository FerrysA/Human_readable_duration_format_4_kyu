# Human_readable_duration_format_4_kyu
# 09.12.2022
# [cылка на задание](https://www.codewars.com/kata/52742f58faf5485cae000b9a)
# Код:
```java
public class TimeFormatter {
    
   
    public static String formatDuration(int seconds) {
        // your code goes here
        int t,ty,td,th,tm;
       int y,d,h,m,s;
       int s1;
        t=seconds;

        y=t/(86400*365);
        ty=t%(365*86400);


        d=ty/86400;
        td=ty%86400;

        h=td/3600;
        th=td%3600;

        m=th/60;
        tm=th%60;

        s=tm;
      s1=s+m*60+h*3600+d*86400+y*86400*365;

      String Res=Print(y,d,h,m,s);
        //System.out.println(Res);
        return Res;
    }
    public static String Print(int y ,int d, int h, int m, int s)
    {
      int t1=s+m*60+h*3600+d*86400+y*86400*365;
        if(t1==0)
        {
            return "now";
        }
        String Res="";
        String Y="year",D="day",H="hour",M="minute",S="second";
        int n;


        int[] t = new int[5];
        String[] T = new String[5];

        int i=0;
        {

            if(y==1)
            {
                t[i]=y;
                T[i]=Y;
                i++;
            }
            if(y>1)
            {
                t[i]=y;
                T[i]=Y+"s";
                i++;
            }

            if(d==1)
            {
                t[i]=d;
                T[i]=D;
                i++;
            }
            if(d>1)
            {
                t[i]=d;
                T[i]=D+"s";
                i++;
            }
            if(h==1)
            {
                t[i]=h;
                T[i]=H;
                i++;
            }
            if(h>1)
            {
                t[i]=h;
                T[i]=H+"s";
                i++;
            }
            if(m==1)
            {
                t[i]=m;
                T[i]=M;
                i++;
            }
            if(m>1)
            {
                t[i]=m;
                T[i]=M+"s";
                i++;
            }
            if(s==1)
            {
                t[i]=s;
                T[i]=S;
                i++;;
            }
            if(s>1)
            {
                t[i]=s;
                T[i]=S+"s";
                i++;

            }
        }
        n=i;
        for(int j=0;j<n;j++)
        {


            if(n==1)
            {
                Res+=t[j]+" "+T[j];
                continue;
            }
            if(j==n-2&&n>1)
            {
                Res+=t[j]+" "+T[j]+" and "+t[j+1]+" "+T[j+1];
                continue;
            }
            if(j<n-1){
                Res+=t[j]+" "+T[j]+", ";
            }

        }
        return Res;
    }
  
  
  
}

```
# понравивщееся решение:(автор авараяб)
``` java
public class TimeFormatter {
    
    public static String formatDuration(int seconds) {
        String res = "";
        int[] units = new int[] {31536000, 86400, 3600, 60, 1};
        String[] labels = new String[] {"year", "day", "hour", "minute", "second"};
        
        if (seconds == 0) return "now";
        
        for (int i = 0; i < 5; i++) {
          if (seconds >= units[i]) {
            int q = seconds / units[i];
            seconds = seconds % units[i];
            res += (res.equals("") ? "" : (seconds == 0 ? " and " : ", "))
                   + q + " " + labels[i] + (q > 1 ? "s" : "");              
          }
        }
        return res;
    }
}
