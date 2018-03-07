package interviewPrep;

public class SwapInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=5;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x+"   "+y);
		
		//2 Method
		x= x*y;
		y=x/y;
		x=x/y;
	}

}
