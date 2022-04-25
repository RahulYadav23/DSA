package com.GCDandLCM;

public class GCD {
    //gcd == greatest common divisor
    public static void main(String[] args)
    {
        System.out.print(gcdofnumbers(6,3));
    }
    //Gcd of number by eular method + recursion TC= long(min(num1,num2))
    static int gcdofnumbers(int num1, int num2)
    {
        if(num2==0)
            return num1;

        return gcdofnumbers(num2,num1%num2);
    }
    //GCD by normal method
    static int gcdNormalway(int a,int b)
    {    int n = Math.min(a,b);
        int gcd=1;
        for(int i=1;i<n;i++)
        {
            if(a%i==0&&b%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
    //lcm*gcd=a*b;
    static int lcm(int a,int b)
    {
        int lcm= (a*b)/gcdofnumbers(a,b);
        return lcm;
    }
    //print all divisor
    static void divisor(int n)
    {
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                System.out.print(i);
        }
    }
}
