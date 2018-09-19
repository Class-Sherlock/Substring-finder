public class test2 {
	
	private static int flag1 = 0; // flag to indicate weather or not a match has been found 
	
	public static void main(String[] args) {
		
		String full = "Here are a couple of coding problems we would like you to complete"; // full string that is used as the input
		String sub = "coding problems we would like "; // sub string to be check for 
		
		if(contains(full, sub)) {
			System.out.println("Yes"); // boolean is used to output the answer 
		}
		else {
			System.out.println("No");
		}
		
	}

	public static boolean contains(String full_string, String sub_string) {
		
		if(full_string.length()<sub_string.length()) { //if the substring is longer than the full string returns false 
		return false;
	    }
		
		char[] array_full = full_string.toCharArray(); // converting strings to arrays
		char[] array_sub = sub_string.toCharArray();
		
		for(int i = 0; i<array_full.length; i++) {
			if(array_full[i] == array_sub[0]) {
				for(int j = 0; j <array_sub.length; j++) {
					if(array_full[i+j] != array_sub[j]) { //checking for consecutive matches between the array elements
						break;
					}
					
					if(j == array_sub.length -1) {
						flag1 = 1; // flag is set indicating that the match has been found
					}
				}
				
			}
		}
		
		if(flag1 == 1) {
			return true;
		}
		return false;
		}
_________________________
