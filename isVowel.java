import java.io.*;
class Vowel
{
public void vowel(char ch)
{
if(ch == 'a'||ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u')
System.out.println("vowel");
else
System.out.println("not vowel");
}
}
class isVowel
{
public static void main(String args[])
{
Vowel vw = new Vowel();
vw.vowel('e');
}
}