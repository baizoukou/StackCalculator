import java.util.Arrays;

public class ExpleBinary {
	private static final int SIZE = 16;
	private static final int START = 40;
	private static final int RANGE = 20;
	private static int[] a = new int[SIZE];
	
	public static void main(String[] args){
		Arrays.load(a, START, RANGE);
		java.util.Arrays.sort(a);
		Arrays.print(a);
		test();
		test();
		test();
		test();
	}
public static void test(){
	int x = Arrays.load(START, RANGE);
	System.out.print("REcherche de x = " + x + ":\t");
	int i = search(a, x);
	if (i >= 0){
		System.out.println("a["+ i + "] = " + a[i]);
	}else{
		System.out.println("i = " + i + " ==> x not found");
	}
	public static int search(int[] a, int x){
		return search(a, 0, a.length - 1, x);
	}
	public static int search(int[] a, int lo, int hi, int x){
		if (lo>hi){
			return -1; // base 
		}
		int i = (lo+hi)/2;
		if(a[i] == x){
			return i;
		}else if(a[i] < x){
			return search(a, i+1, hi, x);
		}else{
			return search(a, lo, i-1, x);
			}
		}
	}
}
}
