import java.util.Scanner;
class CheckPrime 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int c=1,i=2;
while(i<num)
{
  if(num%i==0 || num==2 || num==1)
  {
    c=0;
  }
  i++;
}
if(c==0)
{
  System.out.println("not a prime number");
}
else
{
 System.out.println("yes a prime number");
}
}
}
