package guru;

//import java.security.DomainCombiner;

public class GcdRec {
	public static void main(String[] args) {
	GcdRec rec=new GcdRec();
	var result=rec.gcd(12, 4);
	System.out.println(result);
	
	}
	public int gcd(int a,int b) {
	
		if(a<0||b<0) {
			return -1;
		}
		if(b==0) {
			return a;
		}
		return gcd(a,a%b);	
	}
}
