/*this recursive function convert decimal to hexadecimal */
public class Hexadecimal {
	public static String hexadecimal(int n){
		String s = hex(n%16);
		if(n<16){
			return s;// base 
		}
		return hexadecimal(n/16) + s; // recursivity
	}
	static String hex(int n){
		if(n==0){
			return "0";
		}
		if(n==1){
			return "1";
		}
		if(n==2){
			return "2";
		}
		if(n==3){
			return "3";
		}
		if(n==4){
			return "4";
		}
		if(n==5){
			return "5";
		}
		if(n==6){
			return "6";
		}
		if(n==7){
			return "7";
		}
		if(n==8){
			return "8";
		}
		if(n==9){
			return "9";
		}
		if(n==10){
			return "A";
		}
		if(n==11){
			return "B";
		}
		if(n==12){
			return "C";
		}
		if(n==13){
			return "D";
		}
		if(n==14){
			return "E";
		}else{
			return "F";
		}
		
	}

}
