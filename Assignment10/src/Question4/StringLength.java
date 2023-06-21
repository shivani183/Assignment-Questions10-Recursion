package Question4;

public class StringLength {
	private static int lengthIs(String str)
	{
		if(str.equals(""))
			return 0;
		else
			return lengthIs(str.substring(1))+1;
	}
	public static void main(String[] args) {

		String str="shivani singh";
		System.out.println(lengthIs(str));
		System.out.println(str.substring(1));
	}

}
