package interviewPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ReverseStringWithOutLibs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Type some data for the program: \n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		ReverseStringWithOutLibs reverseStringWithOutLibs = new ReverseStringWithOutLibs();

		String reverseString = reverseStringWithOutLibs.reverseString(inputString);
		System.out.println(reverseString);

		String[] reverseString1 = reverseStringWithOutLibs.reverseStringWords(inputString);
		for (String x : reverseString1)
			System.out.println(x);

	}

	public String reverseString(String str) {
		String reverseString = "";
		for (int len = str.length() - 1; len >= 0; len--) {
			reverseString = reverseString + str.charAt(len);
		}
		return reverseString;
	}

	@SuppressWarnings("null")
	public String[] reverseStringWords(String str) {
		String[] words = str.split(" ");
		String reverseString = "";
		String[] revWords = new String[words.length];
		for (int wordToReverse = 0; wordToReverse < words.length; wordToReverse++) {
			String str1 = words[wordToReverse];
			reverseString = "";
			for (int len = str1.length() - 1; len >= 0; len--) {
				reverseString = reverseString + str1.charAt(len);
			}
			revWords[wordToReverse] = reverseString;
		}
		return revWords;
	}

}
