package Question5;

public class SameCharSubString {
	
	public static int subsetIs(String demo) {
		int count = 0;
        int n = demo.length();
        for (int i = 0; i < n; i++) {
        	for (int j = i; j < n; j++) {
        		if (demo.charAt(i) == demo.charAt(j))
        			count++;
        	}
        }
      
        return count;
	}

	public static void main(String[] args) {
		String demo="abacb";
		System.out.println(subsetIs(demo));

	}

}
