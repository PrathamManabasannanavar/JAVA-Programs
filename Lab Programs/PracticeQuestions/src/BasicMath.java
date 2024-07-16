

class Basics{
	public boolean isPrime(int no){
		for(int i=2; i<=Math.sqrt(no); i++) {
			if(no % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int digitsSum(int no) {
		int sum = 0;
		while(no != 0) {
			int rem = no % 10;
			sum += rem;
			no /= 10;
		}
		return sum;
	}
}
public class BasicMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basics b = new Basics();
		System.out.println(b.digitsSum(24));
		System.out.println(b.isPrime(5));
		
	}

}
