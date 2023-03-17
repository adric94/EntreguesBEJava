package exercici8;

public class Main {
	
    public static void main(String[] args) {
       
    	
    	StringReverser reverseString = str -> {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        };
        
        String inputString = "?séver led o terd leD";
        String reversedString = reverseString.reverse(inputString);
        System.out.println(reversedString);
    }
  
    
}
