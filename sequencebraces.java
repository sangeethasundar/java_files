import java.io.*;
import java.util.*;
public class sequencebraces
{

public static int top=0;
public static String a[]=new String[100];

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str,str1;
System.out.println("enter string");
str=sc.nextLine();
str1=fun(str);
System.out.println(str1);
}

public static String fun(String expression)
{
int i,cnt=0;
String str,x,sequence="NULL";
char j;
StringBuilder sb=new StringBuilder();
for(i=0;i<expression.length();i++)
{
if(expression.charAt(i)=='(')
{
cnt++;
str=""+expression.charAt(i);
str=str+cnt;
push(str);
sb.append(cnt);
}
else if(expression.charAt(i)==')')
{
x=pop();
System.out.println("poped:"+x);
j=x.charAt(1);
sb.append(j);
}
}
sequence=sb.toString();
return sequence;
}


public static void push(String elmt)
{
//global g=new global();
a[top++]=elmt;
}

public static String pop()
{
//global g=new global();
String y=a[--top];
return y;
}
}
