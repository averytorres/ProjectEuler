/*
	A palindromic number reads the same both ways. The largest palindrome made from the
	product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class largestPalindromeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		
		int prod;
		for(int i=999;i>99;i--){
			for(int j=999;j>99;j--){
				prod=i*j;
				if(isPal(prod)){
					if(prod>max){
						max=prod;
					}
				}
			}
		}
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is "+max);

	}

	private static boolean isPal(int prod) {
		// TODO Auto-generated method stub
		String temp=prod+"";

			for(int i=0;i<temp.length()/2;i++){
				if(temp.charAt(i)!=temp.charAt(temp.length()-i-1)){
					return false;
				}
			}
		return true;
	}

}
