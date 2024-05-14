import java.io.*;
class Pow
{
public int power(int a,int b)
{
if(b== 0)
return 1;
return a*power(a,b-1);
}
}
class PowerRecursive
{
public static void main(String args[])
{
Pow gc = new Pow();
int result = gc.power(10,5);
System.out.println(result);
}
}