package interviewPrep;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "*7811hjahs&&^%#";
		//Regular Expression [a-z A-Z 0-9]
		
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

}
