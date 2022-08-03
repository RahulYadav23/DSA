package com.Trees;

import java.util.*;

public class treemain {





    public static void main(String[] args)
    {
      Tree bst = new Tree();
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);
        bst.add(50);
        bst.add(70);
        bst.add(60);
        bst.add(80);


        /*
                       50
                   /       \
                  30       70
                 /  \     /  \
                20  40   60



         */
       // bst.delete(50);


        //bst.commonAssesctor1(20,80);
        bst.call();
    }


}
