package loop;

public class Reverse {

	public static void main(String[] args) {
		int num = 123456789;


        String numString = Integer.toString(num);


        System.out.println(numString);

        int numLength = numString.length();

        System.out.println(numLength);

        int[] numArray = new int[numLength] ;

        for(int i=0; i<numLength; i++) { 
        	numArray[i] = (num%10); 
            num = num/10; 
          }

          int reverseNum=0; 

          for(int i=0; i<numLength; i++) { 
            reverseNum = (reverseNum*10)+numArray[i];

          }

           System.out.println(reverseNum);
        }

	}


