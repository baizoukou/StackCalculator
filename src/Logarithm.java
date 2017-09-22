
public class Logarithm {
	public static int lg(int n){
		if(n==1){
			return 0;// base
		}
		return 1 + lg(n/2);// recursivity
	}

}
