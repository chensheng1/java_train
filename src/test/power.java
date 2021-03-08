package test;

public class power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		power cs =new power();
			System.out.println(cs.test(2,3));
	}
	public double test(double base,int exponent){
		int n= Math.abs(exponent);
		if (n==0){
			return 1;
		}
		if(n==1){
			return base;
		}
		double result = test(base,n>>1);
		result*=result;
		if((n&1)==1){
			result*=base;
		}
		if(exponent<0){
			result=1/result;
		}
		return result;
		
	}
}
