
public class SquareSum {
	//public static void main(String[] args){
		public static int SquareSum(int n){
			if (n==0){
				return n;// base
			}
			return SquareSum(n-1) + n*n; // recursivity
			
		}
	}


