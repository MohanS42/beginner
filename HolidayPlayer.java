import java.util.Scanner;

public class HolidayPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Day");
      
		String temp=sc.next();
		if((temp.equals("sunday"))||(temp.equals("saturday"))) {
		System.out.println("It's Holiday: "+ false);
		}else  {
			System.out.println("It's Working day: "+true);
		}
		
	sc.close();}

}
