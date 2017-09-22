
public class Ackermann {
	public static void ackermann(int m, int n){
		if(m==0){
			return 1;
		}
		if(n==0){
			if(n==1){
				return 2;//base
			}else{
				return m + 2;//base
			}
			return ackermann(ackermann(m-1, n), n-1); // recursivity
		}
	}

}
