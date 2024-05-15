import java.io.*;
class Primes
{
public int isPrime(int n)
{
int flag =1;
if(n == 0 || n==1)
return flag = 0;
for(int i = 2;i<=n/2;i++)
{
if(n%i == 0)
{
flag = 0;
break;
}
}
return flag;
}
}
class SumOfPrimes
{
public static void main(String args[])
{
Primes pm = new Primes();
int n = 17;
boolean flag = true;
for(int i = 2;i <= n/2;i++)
{
if(pm.isPrime(i)==1)
{
if(pm.isPrime(n-i)==1)
{
flag = false;
System.out.println("Yes");
break;
}
}
}
if(flag)
System.out.println("No");
}
}