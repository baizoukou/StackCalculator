
public class Binary {
	public static String binary(int n){
		
		if(n%2==0) {
			s ="0";
		}else{
			s = "1";{
				if(n< 2){
					return s;//base
			}
			return binary(n/2) + 2;//recursivity
		}
}
	}
}
