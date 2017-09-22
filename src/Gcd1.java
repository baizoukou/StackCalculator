
public class Gcd1 {
	public static int gcd1(int m, int n){
		while(m != n){
			if(m<n){
				n -= m;
			}else{
				return n;
			}
		}
		return n;
	}

}
