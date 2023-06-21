package Question6;

public class TowerOfHanoi {
	
	static void tower_of_hanoi(int n, int start, int mid, int end) {
		if(n==0)
			return;
		tower_of_hanoi(n-1, start, end, mid);
		System.out.println("Move disc "+ n +" from tower " + start + " to tower "+end);
		tower_of_hanoi(n-1, mid, start, end);
	}
	public static void main(String[] args) {
		int n=3;
		tower_of_hanoi(n,1,2,3);
	}

}
