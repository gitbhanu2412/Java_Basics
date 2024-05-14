import java.io.*;
class TypeCasting
{
public static void main(String []args)
{
	/*implicit typecasting
	internally compiler will do this.
	ex:- jug of water into bucket
	*/
int a = 69;
double b;
b = a;
System.out.println(b);


	/*explicit typecasting
	we have to do typecasting
	*/
	double x = 2412.45;
	int y;
	y = (int)x;
	System.out.println(y);
	/* truncation
	It will delete some information when we do int/int...
	does not give information after the decimal point
	*/
	int r1 = 17;
	int r2 = 3;
	int res = r1/r2;
	System.out.println(res);
	float res1 = r1/r2;
	System.out.println(res1);
}
}