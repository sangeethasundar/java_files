import java.io.*;
import java.util.*;
import java.lang.*;
public class thoughtworks
{
public static void main(String[] args)
{
int flag,f=0,i,j;
String str="bat";
char ch[]={'t','a','b','c'};
for(i=0;i<str.length();i++)
{
flag=0;
for(j=0;j<ch.length;j++)
{
if(str.charAt(i)==ch[j])
{
flag=1;
break;
}
else
flag=0;
}
if(flag==0)
{
f=0;
break;
}
else
f=1;
}
if(f==1)
System.out.println(str);
else
System.out.println("no");
}
}

