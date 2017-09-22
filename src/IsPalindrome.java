
public class IsPalindrome {
	public boolean isPalindrome(String s){
		int len = s.length();
		if(len<2){
			return true;
		}if(s.charAt(0) != s.charAt(len-1)){
			return false;
		}if(len==2){
			return true;
		}
		return isPalindrome(s.substring(1, len-1)); // recursive
	}
}

/*this recursive class determine if the chaine is a palindrome*/