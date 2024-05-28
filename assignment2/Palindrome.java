package assignment2;

public class Palindrome {

	public static void main(String[] args) {
		  int input = 12345; 
	        
	        
	        int output = 0;
	        int temp = input;
	        while (temp != 0) {
	            int digit = temp % 10;
	            output = output * 10 + digit;
	            temp /= 10;
	        }

	      
	        if (input == output) {
	            System.out.println("Input: " + input + " Output: It is a Palindrome");
	        } else {
	            System.out.println("Input: " + input + " Output: It is not a Palindrome");
	        }

	}

}
