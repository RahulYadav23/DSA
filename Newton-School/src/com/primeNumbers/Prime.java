package com.primeNumbers;

public class Prime {
    public static void main(String[] args)
    {
      //printPrimeUptoNumber(100);
        //primeLongRange(1000);
      primeInRange(10,20);
    }
    //to check a number is prime or not T.C = squreroot(n)
    static boolean checkNumberPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    //print number prime to certain number. T.C = n*squareroot(n)
    static void printPrimeUptoNumber(int n)
    {    boolean x = true;
        for(int i=2;i<n;i++)
        {    x=true;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0) {
                    x = false;
                    break;
                }

            }
            if(x)
                System.out.print(i+" ");
        }
    }
    //if the number range is more, most efficent way to find Sieve of Eratosthenes algo T.C=n*log(log(n))
    static void primeLongRange(int x)
    {
        boolean[] prime = new boolean[x+1];
        for(int i=0;i<=x;i++)
            prime[i]=true;

        prime[0]=false;
        prime[1]=false;

        for(int i=2;i*i<=x;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<=x;j=j+i)
                {
                    prime[j]=false;
                }
            }
        }

        System.out.println("Print the Primes");
        for(int i=2;i<=x;i++)
        {
            if(prime[i]==true)
                System.out.print(i+" ");
        }
    }
   //Prime in range T.C = (n2-n1)*squareroot()
    static void primeInRange(int n1,int n2)
    {   boolean x = true;
        if(n1==1)
            n1=n1+1;
        for(int i=n1;i<=n2;i++)
        {   x= true;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0) {
                    x=false;
                    break;
                }
            }
            if(x)
                System.out.print(i+" ");
        }
    }
}
