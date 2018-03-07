package interviewPrep;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {-10,11,7,8,11,90009};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i =1; i<numbers.length;i++)
		{
			if(numbers[i]>largest)
				largest=numbers[i];
			if(numbers[i]<smallest)
				smallest=numbers[i];
			
		}
		
		System.out.println("Largest number is : "+largest);
		System.out.println("Smallest number is : "+smallest);
	}

}
