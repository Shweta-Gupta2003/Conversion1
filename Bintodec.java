import java.util.*;
class Bintodec
{
public static void main(String args[])
{
int binary,dec=0,rem,i=1;
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the binary number:");
binary=sc.nextInt();

while(binary!=0)
{
rem=binary%10;
dec=dec+rem*i;
i=i*2;
binary=binary/10;
}

System.out.println("Decimal number is "+dec);
}
}