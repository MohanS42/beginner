package Guvi;

import java.util.Scanner;

public class palidrome {

	public static void main(String[] args) {
		int reverse=0,remainder=0;
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
while(number!=0)
{
	 remainder=remainder%10;
	reverse = (reverse*10)+remainder;
	number=number/10;
}
if(number==reverse)
{
	System.out.println("palidrome");
}else{System.out.println("not palidrome");
}
}}
