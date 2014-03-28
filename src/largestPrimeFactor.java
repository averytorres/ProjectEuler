/*
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
 */
public class largestPrimeFactor {

	public static void main(String[] args){
		double t=0;
		double target=600851475143.0;
		int lPrime=0;
		for(int i=2;i<Math.sqrt(target);i++){
			if(isPrime(i)){
				if(target%i==0){
					lPrime=i;
				}
			}
		}
		System.out.println("The largest prime factor for the number "+target+" is "+lPrime);
	}
	public static boolean isPrime(int num){
		
		for(int i=2;i<Math.sqrt(num);i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
