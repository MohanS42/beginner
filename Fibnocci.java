package Beginner;

import java.util.Scanner;

public class Fibnocci {

	public static void main(String args[]) {
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter the number: ");
	         long t=sc.nextInt();
			 long n1=0,n2=1;
             long n=0;
              System.out.println(n1+" "+"\n"+n2);
              for(int i=2;i<t;i++){
        	n=n1+n2;
         	System.out.println(n);
        	n1=n2;
        	n2=n;
        }
	}}

