package guru;

public class PowerRec {
public static void main(String[] args) {
	PowerRec rec=new PowerRec();
	var result=rec.power(2, 2);
	System.out.println(result);
}

public int power(int base,int exp) {
	if(exp<0) {
		return -1;
	}
if(exp==0) {
	return 1;
}
	return base*power(base,exp-1);
	
}
}
