package com.backtracking;

import java.util.*;

public class possiblewords {
    static Character[][] CharMap;

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Charactermap();

      ArrayList<String> answer=solve(a,0,"");
      for(String s:answer)
          System.out.print(s+" ");
    }

    public static ArrayList<String> solve(int[] a,int index,String s)
    {
          if(index==a.length)
          {   ArrayList<String> subanswer = new ArrayList<>();
              subanswer.add(s);
              return subanswer;
          }
        ArrayList<String> stringList = new ArrayList<>();
              for(int j=0;j<CharMap[a[index]].length;j++)
              {
                  s=s+CharMap[a[index]][j].toString();

                 stringList.addAll(solve(a,index+1,s));
                 s=s.substring(0,s.length()-1);

              }

          return stringList;
    }

    private static void Charactermap()
    {
        CharMap = new Character[10][5];
        CharMap[0] = new Character[]{'\0'};
        CharMap[1] = new Character[]{'\0'};
        CharMap[2] = new Character[]{'a','b','c'};
        CharMap[3] = new Character[]{'d','e','f'};
        CharMap[4] = new Character[]{'g','h','i'};
        CharMap[5] = new Character[]{'j','k','l'};
        CharMap[6] = new Character[]{'m','n','o'};
        CharMap[7] = new Character[]{'p','q','r','s'};
        CharMap[8] = new Character[]{'t','u','v'};
        CharMap[9] = new Character[]{'w','x','y','z'};
    }

}
