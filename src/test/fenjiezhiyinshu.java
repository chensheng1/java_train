package test;
/**
 *����������
 * @author cs
 * @Time 2016-11-08
 */
import java.util.Scanner;

public class fenjiezhiyinshu {
	public void test(){
		System.out.println("���������һ��������");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=2;i<=n;i++){
			while(n!=i){
			if(n%i==0){
				n=n/i;
				System.out.println("�ֽ��������"+i);
			}else{
				break;
			}
			}
		}
		System.out.println("�ֽ��������"+n);
	}
		public static void main(String arg[]){
			/**
			 * 
			 */
			fenjiezhiyinshu cs=new fenjiezhiyinshu();
			cs.test();
		}
}
