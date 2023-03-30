package guru;

public class SumOfDigitsRec {
public static void main(String[] args) {
	SumOfDigitsRec recursion=new SumOfDigitsRec();
var result=recursion.sumOfDigits(111);	
System.out.println(result);
}
public int sumOfDigits(int n) {
	if(n<0) {
		return 0;
	}
	if(n==0) {
		return 0;
	}
	return n%10+sumOfDigits(n/10);
}
}
