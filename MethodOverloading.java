import java.io.*;
/* MethodOverloading
	-Same method name and different parameters/arguments
	-same method name and same parameters but different datatypes should be present
	*/
class Calcu
{
public int add(int num1,int num2)
{
return num1+num2;
}
public int add(int num1,int num2,int num3)
{
return num1+num2+num3;
}
public double add(double num1,double num2)
{
return num1+num2;
}
}
class MethodOverloading
{
public static void main(String args[])
{
Calcu cc = new Calcu();

int res1 =cc.add(2,3);
int res2 = cc.add(4,6,9);
double res3 = cc.add(2.5,3.5);
System.out.println("add(int,int): "+res1);
System.out.println("add(int,int,int): "+res2);
System.out.println("add(double,double): "+res3);
}
}