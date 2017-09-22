
public class Sum {
	public static double sum(double b, int n){
		if (n==0){
			return 1;// base
		}
		return 1 + b*sum(b, n-1);//recursivity
	}

}
