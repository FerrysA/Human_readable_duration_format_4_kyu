
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;// библ для ввода с клавиатуры
import java.util.*;
public class Main {



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
        // System.out.println(Res);
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



    private static Scanner inn = new Scanner(System.in);// метод для ввода с клавиатуры

    public static <string> void main(String[] args) {

        System.out.println(formatDuration(77777777));
     






    }
}

