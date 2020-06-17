package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_Special {
    public  static void Change1 (int[][] array, int n1, int m1, int n, int m)
    {
        for (int i=0; i<n; i++)
        {
            int a=array[i][n1-1];
            int b=array[i][m1-1];
            a=a+b;
            b=a-b;
            a=a-b;
            array[i][n1-1]=a;
            array[i][m1-1]=b;
        }
    }
    public  static void Change2 (int[][] array, int n1, int m1, int n, int m)
    {
        for (int i=0; i<m; i++)
        {
            int a=array[n1-1][i];
            int b=array[m1-1][i];
            a=a+b;
            b=a-b;
            a=a-b;
            array[n1-1][i]=a;
            array[m1-1][i]=b;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n=0;
        int m=0;
        int k=0;
        s+=" ";
        String s1="";
        for (int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            {
                s1+=s.charAt(i);
            }
            else
            {
                if (n==0)
                {
                    //System.out.println(s1);
                    n=Integer.parseInt(s1);
                    s1="";
                }
                else
                {
                    if(m==0)
                    {
                       // System.out.println(s1);
                        m=Integer.parseInt(s1);
                        s1="";
                    }
                    else
                    {
                        if(k==0)
                        {
                            //System.out.println(s1);
                            k=Integer.parseInt(s1);
                            s1="";
                        }
                    }
                }
            }
        }
        s1="";
        // end of initialization m, n, k - metoda naimen'shikh kvadratov
        int[][] array = new int[n][m];
        for(int i=0; i<n; i++)
        {
            s = reader.readLine();
            s+=" ";
            int j=0;
                for(int l=0; l<s.length(); l++) {
                    if (s.charAt(l)!=' ')
                    s1 += s.charAt(l);
                    else {
                        //System.out.println(s1);
                        array[i][j] = Integer.parseInt(s1);
                        j++;
                        s1 = "";
                    }
                }
        }
        /*for (int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*/
        //end of initialization of array
        for(int i=0; i<k; i++)
        {
            s = reader.readLine();
            s+=" ";
            char c=' ';
            int n1=0;
            int m1=0;
            for(int l=0; l<s.length(); l++) {
                if (s.charAt(l)!=' ')
                    s1 += s.charAt(l);
                else {
                    if (c==' ')
                        c=s1.charAt(0);
                    else
                        if(n1==0)
                        {
                            n1 = Integer.parseInt(s1);
                        }
                        else
                            m1 = Integer.parseInt(s1);
                    //System.out.println(s1);
                    s1 = "";
                }
            }
            //read command
            if (c=='g')
                System.out.println(array[n1-1][m1-1]);
            if(c=='c')
                Change1(array, n1, m1, n, m);
            if (c=='r')
                Change2(array, n1, m1, n ,m);
            /*for (int u=0; u<n; u++)
            {
                for(int j=0; j<m; j++)
                {
                    System.out.print(array[u][j]+" ");
                }
                System.out.println();
            }*/
        }
    }
}
