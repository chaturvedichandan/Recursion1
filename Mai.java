package guru;

public class Mai {
	public static void main(String[] args) {
		Mai recursion =new Mai();
				var rec=recursion.factorial(4);
		System.out.println(rec);
	}
	public int factorial(int n) {
		if(n<1) {
			return -1;
		}
		if(n==0||n==1) {
			return 1;
		}
		//System.out.println(n);
		return n*factorial(n-1);
		
	}
}
