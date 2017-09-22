
public class Ex002 {
	public static void main(String[] args){
		for(double x=0. ; x<1.0; x += 0.1){
			System.out.println(s(x) + "\t" + sinh(x));
			
		}for(double x=0.; x<1.0; x += 0.1){
			System.out.println(c(x) + "\t" + cosh(x));
		}
	}
	public static double s(double x){
		if(Math.abs(x) < 0.005){
			return x + x*x*x/6;
		}
		return 2 * s(x/2) *c(x/2);
		
	}
	
	public static double c(double x){
		if(Math.abs(x) < 0.005){
			return 1.0 + x*x/2;
		}
		return 1 + 2*s(x/2);
	}
	
	public static double sinh(double x){
		return (Math.exp(x) - Math.exp(-x)) /2.0;
	}
	
	public static double cosh(double x){
		return (Math.exp(x) + Math.exp(-x))/2.0;
	}

}
