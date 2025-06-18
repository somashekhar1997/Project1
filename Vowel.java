package loop;

public class Vowel {


	    public static void main(String[] args) {
	        countVowels("Hello word");
	    }

	    public static void countVowels(String input) {
	        int vowelCount = 0;
	        String vowels = "aeiouAEIOU";

	        for (int i = 0; i < input.length(); i++) {
	            if (vowels.indexOf(input.charAt(i)) != -1) {
	                vowelCount++;
	            }
	        }

	        System.out.println("Number of vowels: " + vowelCount);
	    }
	}
