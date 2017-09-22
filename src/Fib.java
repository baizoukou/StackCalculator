/*below is the iterative implementation of fibonacci */

public class Fib {
	public static int fib(int n){
		if(n<2){
			return n;
		}
		int f0=0, f1=1, f=f0+f1;
		for(int i=2; i<n; i++){
			f0 = f1;
			f1 = f;
			f = f0 + f1;
		}
		return f;
	}

}
