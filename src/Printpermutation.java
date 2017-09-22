
public class Printpermutation {
	public static void printpermutation(String str, String string){
		printpermutation("", str);
	}
public static void printpermutation(String left, String right){
	int n=right.length();
	if(n==0){
		return;
	}
	if(n==1){
		System.out.println(left+right);
		return;
	}StringBuffer s = new StringBuffer(right);
	for(int i=0; i<n; i++){
		char temp = s.charAt(i);
		s.setCharAt(i, s.charAt(0));
		
	}
}
}
