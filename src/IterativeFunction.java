/*
 * this piece of code implement the explicit formula previously given. the right expression is composed of k coeffiscients k, 
 * for loop repeat the number k time
 * */
public class IterativeFunction {
	public static void main(String[] args){
		
	}
	public static int c(int n, int k){
		if(n<2 || k==0 || k==n){
			return 1;
		}
		int c=1;
		for (int j=1; j <= k; j++){
			c = c*(n-j+1)/j;
			//return c;
		}
		return c;
	}
	

}
