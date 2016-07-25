/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner sc=new Scanner(System.in);
int n,j;
n=sc.nextInt();
String a[]=new String[100];
for(int i=0;i<n;i++)
{
a[i]=sc.next();
}
        String l;        l = "";
        String check;
if(a.length>0)
l=a[0];
for(int i=1;i<a.length;i++)
{
check=a[i];
for(j=0;j<Math.min(l.length(),a[i].length());j++)
{
if(l.charAt(j)!=check.charAt(j))
break;
}
l=a[i].substring(0,j);
}
System.out.println("longest prefix is:"+l);
}
}
