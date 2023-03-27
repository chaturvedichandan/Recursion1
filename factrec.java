package guru;

public class factrec {
public static void main(String[] args) {
	 
	
	int n=4;
	System.out.println("factorial of "+ n +" is " +factorial(n));
}
	public static int factorial(int n) { 
		if(n<1) {
			return n-1;
		}
		if(n==0||n==1) {
			return 1;
		}
		return n*factorial(n-1);  
	
}
}
