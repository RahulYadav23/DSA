package com.modulus;

public class modulus {
    public static void main(String[] args)
    {
  System.out.print(power(2,5));
         //modulus of number is given by % which gives the reminder
        // for -ve number also we get postive number.

    }
    //power funtion use power don't do high
    static long power(long n,long p)
    {
        long ans=1L;
        while (p!=0)
        {   //System.out.println(p);
            if((p&1)==1)
            {
                ans=n*ans;
            }
            n=n*n;
            p=p>>1;
        }
        return ans;
    }
    //power value too high need modulus
    static long power(long a ,long b,long m)
    {
        long ans =1L;
        while(b!=0){
            if((b&1)==1)
            {
                ans =(ans*a)%m;
            }
            a=(a*a)%m;
            b=b>>1;
        }
        return ans;
    }
}
