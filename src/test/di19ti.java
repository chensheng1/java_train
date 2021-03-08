package test;
/**
 * 计算2/1,3/2,5/3，8/5。。。前20项和
 * @author cs
 *@TIME2016-11-20
 */

public class di19ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int t;
		double s=b/a;
		for(int i=1;i<=20;i++){
			s=s+b/a;
			t=b;
			b=a+b;
			a=t;
			System.out.println(b+"/"+a);
		}System.out.println(s);
	}

}
