
public class GCD {
	public static void main(String[] args){
		public static int gcd(int m, int n){
			if(m==n){
				return; // base
		
			}else if(m<n){
				return gcd(m, n-m);// recursivity
				
			}else{
				return gcd(m-n, n);
			}
			
		}
	}

}
/*
 * the call gcd(494, 130) appelle recursivity gcd(364, 130),it calls recursively 
 * gcd(234, 130), which call recursively gcd(104, 130)
 *  which calls gcd(104, 26), which calls gcd(78, 26) which call gcd(52, 26), which call recursively gcd(26, 26), which return 26. the value is then successively send to the initial gcd(494, 130) 
 * 
 */