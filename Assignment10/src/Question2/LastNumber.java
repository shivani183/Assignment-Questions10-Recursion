package Question2;

public class LastNumber {
	public static int isLastNumb(int n) {
		boolean flag=true;
		int head=1;
		int gap=1;
		while(n>1) {
			if(flag || n%2==1) 
				head=head+gap;
			gap=gap*2;
			flag= !flag;
			n=n/2;
			
		}
		return head;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		int n=arr.length;
		int result=isLastNumb(n);
		System.out.println(result);

	}

}
