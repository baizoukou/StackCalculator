
public class Trigo {
	
	/*
	 * This program works because x is divided by 2 for each recursive call.
	 * it finishes by reaching criteria (-0.005 < x && <0.005) which stop the recursivity. 
	 * when x is small, the results give a precise result at 15 decimal
	 * */
	
	public static double main(String[] args){
				for(double x=0.; x<1.0; x += 0.1){
			System.out.println(s(x) + "\t" + Math.sin(x));
			
		}for(double x=0.; x<1.0; x += 0.1){
			System.out.println(c(x) + "\t" + Math.cos(x));
		}
		public static double s(double x){
			if(-0.005 < x && x<0.005){
				return x - x*x*x/6;// base
			}
			return 2*s(x/2)*c(x/2);// recursivity
			
		}
		public static double c(double x){
			if(-0.005 < x && x<0.005){
				return 1.0 - x*x/2;// base
				
			}
		}
	}

}
