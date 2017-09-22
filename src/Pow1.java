
public class Pow1 {
	public static double Pow1(double x, int n){
		if (n==0){
			return 1.0;// base
			
		}
		double p = Pow1(x, n/2);
		if(n%2==0){
			return p*p;// recursivity (n even)
		}else{
			return x*p*p;// recursivity (n odd)
		}
	}

}
