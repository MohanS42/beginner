package Beginner;

import java.util.Scanner;

public class Facto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int m,m1=1;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         m=sc.nextInt();
             for(int m2=1;m2<=m;m2++){
	                               m1*=m2;
         }System.out.println(m1);
                 sc.close();	}

}
