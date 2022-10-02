package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int fact=1;
		
	for(int i=num;i>0;i--) {
		
		fact = i*fact;
			
	}
	System.out.println("The Result of the factorial 5 is" + fact);
	}

}
