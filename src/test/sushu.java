package test;
/**
 * ����101��200������
 * @author cs
 *@Time2016-10-6
 */
public class sushu {
	public static void main(String arg[]){
		/*
		 * 
		 */
	System.out.println("------101��200֮�������-------");
		int j;
		for(int i=101;i<=200;i++){
			for(j=2;j<i;j++){
				if(i%j==0){
					break;
				      }
			}
			    if(i==j){
			      System.out.print("����Ϊ"+i);
			    }
			}
		}
}


