import java.io.*;
class Variables
{
/* Instance Variables 
	- Stored in Heap Area
	- Created upon object creation
	- Garbage collector will destroy the instance variables if object scope is completed
	-  Default value will be given if we not initialise them
	ex:- for int = 0; String = null etc...
	*/
	
int age; //Instance Variable
String name; //Instance Variables
public static void main(String args[])
{
/* Local Variables
	- Local to methods
	- we have to intialise them before using
	- Stored in Stack Area
	- Destroyed after method is completed
	*/
int age = 21;
String name = "Bhanu";
//Object Creation
Variables vr = new Variables();
System.out.println("Instance variables");
System.out.println("name: "+vr.name);
System.out.println("age: "+vr.age);
System.out.println("Local Variables");
System.out.println("name: "+name);
System.out.println("age "+age);
}
}