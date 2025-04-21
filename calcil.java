import java.lang.*;
import java.util.Scanner;
class testing{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
System.out.println("enter a  and b:");
c=sc.nextInt();
switch(c)
{
case 1: c=a+b;
System.out.println("addition of a and b:");
break;
case 2: c=a-b;
System.out.println("difference of a and b:");
break;
case 3: c=a*b;
System.out.println(" product of a and b:");
break;
case 4: c=a/b;
System.out.println("division of a and b:");
break;
}
}
}
