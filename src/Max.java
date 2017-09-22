
public class Max {
	public static double Max(double[] a, int n){
		if(n==1){
			return a[0];//base
		}
		double m = Max(a,n-1);// recursivity
		if(a[n - 1] > m){
			return a[n -1];
		}else{
			return m;
		}
	}

}
