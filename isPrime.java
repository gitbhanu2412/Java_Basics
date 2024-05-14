import java.io.*;
class Prime
{
	public void prime(int num, boolean flag)
	{
		for(int i = 2;i <= num/2;i++)
		{
			if(num %i == 0)
			{
				flag = false;
			System.out.println("composite");
			break;
		}
		}
		if(flag)
			System.out.println("Prime");
	}
}
class isPrime
{
public static void main(String args[])
{
Prime pm = new Prime();
boolean flag = true;
pm.prime(12,flag);
}
}