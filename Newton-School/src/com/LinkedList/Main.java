package com.LinkedList;

import java.util.Locale;

public class Main {


    public static void main(String [] args)
    {

      LinkedListCustom singlelist = new LinkedListCustom();
      singlelist.addback(10);
      singlelist.addback(20);
      singlelist.addback(30);
      singlelist.addback(40);
      //System.out.println(singlelist.getat(1));
     // singlelist.displaylist();
      //singlelist.deleteNPos(4);
      singlelist.displaylist();
    singlelist.reverse();
        singlelist.displaylist();
    //   System.out.println(singlelist.printMiddle());
    }
}
