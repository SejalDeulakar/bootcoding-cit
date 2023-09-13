public class Palindrome
{
public static void main(String args[])
{
int n = 1234;
int num=n;
int reverse = 0;
while(n>0)
{
int remainder = n%10;
reverse = (reverse*10)+remainder;
n = n/10;
}
if (num == reverse)
{
System.out.println("Is a Palindrome number"+num);
}
else
{
System.out.println("Is not a Palindrome number"+num);
}
}
}