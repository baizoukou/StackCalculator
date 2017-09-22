
public class Pr001 {
	public static double main(String[] args){
		for(double x=0. ; x<1.0; x += 0.1){
			System.out.println(s(x) + "\t" + Math.sin(x));
			
		}for(double x=0.; x<1.0 ; x += 0.1){
			System.out.println(c(x) + "\t" + Math.cos(x));
			
		}
		public static double s(double x){
			if(Math.abs(x) < 0.00005){
				return x - x*x*x/6;
			}
			return 2*s(x/2)*c(x/2);
		}
		public static double c(doble x){
			if(Math.abs(x) < 0.00005){
				return 1.0 - x*x/2;
			}
		}
	}

}
