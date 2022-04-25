package com.sorting;

public class sorting {
   public static void main(String[] args) {
       int[] arr = {5, 4, 3, 2, 1};
       //selectionsort(arr);
       //bubblesort(arr);
       // int[] s = mergeSort(arr,0, arr.length-1);
       quicksort(arr,0, arr.length-1);
       for(int i:arr)
       {
           System.out.print(i+" ");
       }
   }
   static  void swap(int [] a,int i,int j)
   {
       int temp = a[i];
       a[i]=a[j];
       a[j]=temp;
   }

   static void selectionsort(int[] a)
   {
       for(int i=0;i<a.length;i++)
       {    int min=i;
           for(int j=i+1;j< a.length;j++)
           {
               if(a[min]>a[j])
                   min=j;
           }
           swap(a,i,min);
       }
   }
   static void bubblesort(int [] a)
   {
       for(int i=0;i<a.length;i++)
       {
           for (int j=0;j<a.length-1-i;j++)
           {
               if(a[j]>a[j+1])
               {
                   swap(a,j,j+1);
               }
           }
       }
   }
   static void insertionsort(int []a)
   {    int key,j;
       for(int i=1;i< a.length;i++)
       {
        key =a[i];
        j =i-1;
        while(j>=0&&a[j]>key)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
       }
   }
 static  int [] mergeSort(int[] a,int l,int r)
   {   int mid = (l+r)/2;
       if(l>=r)
       {
           int [] res = new int[1];
           res[0]=a[l];
           return res;
       }
       int [] left=mergeSort(a,l,mid);
       int [] right=mergeSort(a,mid+1,r);
       return mergedsortedArray(left,right);

   }
   static int[] mergedsortedArray(int[] a, int[] b)
   {
       int[] c = new int[a.length+b.length];
       int i=0,j=0,k=0;
       while(i<a.length&&j<b.length)
       {
           if(a[i]<b[j])
           {
               c[k]=a[i];
               i++;
               k++;
           }
           else
           {
               c[k]=b[j];
               j++;
               k++;
           }
       }
       while (i<a.length)
       {
           c[k]=a[i];
           i++;
           k++;
       }
       while (j<b.length)
       {
           c[k]=b[j];
           j++;
           k++;
       }

       return c;
   }
    static void  quicksort(int [] a, int l,int r)
    {
        if(l<r)
        {
            int p = partition(a,l,r);
            quicksort(a,l,p-1);
            quicksort(a,p+1,r);
        }
    }
   static  int partition(int[] a, int l,int r)
   {   int i=l-1;
       int x =a[r];
       for(int j=l;j<r;j++)
       {
           if(a[j]<=x)
           {
               i=i+1;
               swap(a,i,j);
           }
       }
       swap(a,i+1,r);
       return i+1;
   }

}

