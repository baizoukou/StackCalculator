
public class Pow {
	public static double Pow(double x, int n){
		if(n==0){
			return 1.0;// base
		}
		return x*Pow(x, n-1);// recursivity
	}

}
