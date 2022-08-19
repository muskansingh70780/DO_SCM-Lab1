public class LargestNumber
{
void largest(int a,int b,int c)
{
if(a>b && a>c)
{
System.out.println(a);
}
else if(b>a && b>c)
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}
public static void main(String[] arg)
{
int s;
LargestNumber s1=new LargestNumber();
s1.largest(10,20,30);
//System.out.println(s);
}
}