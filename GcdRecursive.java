import java.io.*;
class Gcd
{
public int gcd(int a,int b)
{
if(a == 0)
return b;

if(b == 0)
return a;
if(a == b)
return a;
if(a>b)
return gcd(a-b,b);
return gcd(a,b-a);
}
}
class GcdRecursive
{
public static void main(String args[])
{
Gcd gc = new Gcd();
int result = gc.gcd(98,56);
System.out.println(result);
}
}