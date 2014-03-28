/*
 * 
If we list all the natural numbers below 10 that are multiples of 3 or 5, 
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

 * 
 */
public class multiplesOf3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int max=1000;
		for(int i=1;i<max;i++){
			if((3*i)<max){
				sum=sum+(3*i);
				//System.out.print(3*i+",");
			}
			if((5*i)%15!=0){
				if((5*i)<max){
					sum=sum+(5*i);
					//System.out.print(5*i+",");
				}
			}
			
		}
		System.out.println();
		System.out.println("The sum of all the multiples of 3 and 5 below "+max+" is "+sum+".");
	}

}
