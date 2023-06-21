package Question3;

public class SubSet {
	public static void subsetIs(String demo, int index, String newSub) {
		int n=demo.length();
		if(index==n) {
			System.out.println(newSub);
			return;
		}
		subsetIs(demo,index+1,newSub + demo.charAt(index));
		subsetIs(demo,index+1,newSub);
		
	}

	public static void main(String[] args) {
		String demo="abcd";
		int index=0;
		String newSub="";
		subsetIs(demo, index, newSub);

	}

}
