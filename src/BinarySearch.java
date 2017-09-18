
public class BinarySearch {
	//public static void main(String[] args){
	public static int search(int[] a, int lo, int hi, int x){
		/*
		 * first condition: a[0] <= a[1] <= ... <= a[a.length-1];
		 * second condition : remove i, if i >= 0, then a[i] == x;
		 * the execution time of the recursive binary search is = to 0(lgn)
		 * the execution time frame is proportional to the recursive calls.
		 * each recursive calls is equal to the total time were n can be divided by 2, meaning lg n  
		 */
		
	if(lo>hi){
		return -1;
	}
	int i = (lo+hi)/2;
	if(a[i] == x){
		return i;
	}else if(a[i] < x){
		return search(a, lo,i-1,1);
	}
	return i;
		
		
	}

}
