package Question1;

public class PowerOfThree {
	public static boolean isPowerOfThree(int n) {
		if(n<=0)
			return false;
		if(n==1)
			return true;
        if(n%3 !=0)
            return false;
		return isPowerOfThree(n/3);
	}

	public static void main(String[] args) {

		int n=0;
		boolean result=isPowerOfThree(n);
		System.out.println(result);
	}

}
