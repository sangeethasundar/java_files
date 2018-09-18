import java.io.*;
import java.lang.*;
import java.util.*;
public class infosysspecialist1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,j,len,k;
System.out.println("enter no of alternations(should be lesser than no of names in string):");
k=sc.nextInt();
String str="alice,bob,venice,jack,paul,louise,canal,mack,henry,einstein";
for(j=0;j<k;j++)
{
String names[]=str.split(",");
str=" ";
len=names.length;
for(i=0;i<len;i+=2)
{
names[i]=" ";
}
System.out.println("after iteration:"+j);
for(String n:names)
{
if(n!=" ")
System.out.print(n+",");
}
System.out.println();
for(String n:names)
{
if(n!=" ")
{
str+=n;
str+=",";
}
}
}
}
}