package guru;

public class DecTBinRec {
public static void main(String[] args) {
	DecTBinRec rec=new DecTBinRec();
	var result=rec.DecimalToBinary(13);
	System.out.println(result);
}
public int DecimalToBinary(int n) {
	if(n==0) {
		return 0;
	}
	return n%2+10*DecimalToBinary(n/2);
	
}
}
