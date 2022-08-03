package com.graph;

import java.util.*;


public class knightProblem {


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sour = scan.nextLine();
        String dest = scan.nextLine();

        int x = getX(sour);
        int y = getY(sour);
        pair source = new pair(x,y);


        x = getX(dest);
        y = getY(dest);


        pair destination = new pair(x,y);



    }
    static class pair{
        int x;
        int y;

        pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    static int bfs(pair source ,pair destination)
    {
          return -1;
    }

    static int getX(String str)
    {
        return str.charAt(0)-'a';
    }

    static int getY(String str)
    {
        return str.charAt(1)-'1';
    }
}
