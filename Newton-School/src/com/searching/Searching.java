package com.searching;

public class Searching {

    public static void main(String[] args)
    {

     int [] a = {1,2,3,4,5,6};
     //System.out.println(binarySearch(a,3));
        System.out.println(ternarysearch(a,3));
    }
    // T.C = n
    static int linearSearch(int []a,int k)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k) {
                return i;

            }
        }
        return -1;
    }
    //binary search tc = log(n)
    static int binarySearch(int[] a,int k)
    {

        int low = 0;
        int high = a.length-1;
        while (low<=high)
        {   int mid = (low+high)/2;
            if(a[mid]==k)
            {
                return mid;

            }
            if(a[mid]<k)
            {
                low=mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
    static int ternarysearch(int[] a,int k)
    {
        int low=0;
        int high=a.length-1;
        while (low<=high)
        {
            int partition = (high-low)/2;
            int m2 = high-partition;
            int m1 =low+partition;
            if(a[m1]==k)
                return m1;
            else if(a[m2]==k)
                return m2;

            if(k>a[m2])
            {
                low = m2+1;
            }
            if(k<a[m1])
            {
                high = m1-1;
            }
            else
            {
                low = m1+1;
                high=m2-1;
            }


        }
        return -1;
    }
}
