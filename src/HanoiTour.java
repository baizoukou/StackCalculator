
public class HanoiTour {
	public static void main(String[] args){
		runHanoiTour(4, 'A', 'B', 'C');
	}
public static void runHanoiTour(int n, char x, char y, char z){
	if(n==1){
		System.out.println("Move the top disque" + x+ "to" + z);
		
	}else{
		runHanoiTour(n-1, x,z,y);
		runHanoiTour(1, x, y, z);
		runHanoiTour(n-1, y, x, z);
	}
}
}
