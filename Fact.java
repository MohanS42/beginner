package Guvi;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		int i,num,fact=1;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(i=1;i<=num;i++){
			fact=fact*i;
	}
System.out.println("factorial is "+ fact);
	}
}
