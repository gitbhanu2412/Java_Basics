import java.io.*;
class DType
{
public static void main(String []args)
{
	/* primitive datatypes
	 byte ==> 1 Byte
	 short ==> 2 Byte
	 int ==> 4 bYte
	 long ==> 8 Byte
	 float ==> 4 Byte
	 double ==> 8 Byte
	 boolean ==> 1 bit( 0 or 1 )
	 char ==> 2 Byte
	 */
byte a = 10;
byte c = 20;
//we cannot perform operations like +,*,/ etc on byte.So, we use int data type...
int b = a+c;
System.out.println(b);
long x = 4555555l;
//we should use l/L for long datatype , if not java will consider as int datatype....
System.out.println(x);
float d = 45.55f;
//we should use f because in java by default double will be considered for floating data...
System.out.println(d);

boolean y = true;
System.out.println(y);
// Boolean will always has two values = true or false and we have initialise it to either true or false...
char ch = '@';
System.out.println(ch);
//In java character datatype uses UTF-16 encoding (unicode transformation format) which is of 2 bytes...
}
}