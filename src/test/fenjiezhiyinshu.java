package test;
/**
 *计算质因数
 * @author cs
 * @Time 2016-11-08
 */
import java.util.Scanner;

public class fenjiezhiyinshu {
	public void test(){
		System.out.println("请随便输入一个正整数");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=2;i<=n;i++){
			while(n!=i){
			if(n%i==0){
				n=n/i;
				System.out.println("分解的质因数"+i);
			}else{
				break;
			}
			}
		}
		System.out.println("分解的质因数"+n);
	}
		public static void main(String arg[]){
			/**
			 * 
			 */
			fenjiezhiyinshu cs=new fenjiezhiyinshu();
			cs.test();
		}
}
