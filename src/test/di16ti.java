package test;

import java.util.Arrays;
import java.util.Scanner;

public class di16ti {
	/*public static int[] selectionSort(int[] ary){
    for(int i=0; i<ary.length-1; i++ ){
      for(int j=i+1; j<ary.length; j++){
        if(ary[i]>ary[j]){
          int temp = ary[i];
          ary[i] = ary[j];
          ary[j] = temp;
        }
      }
    }
    return ary;
}*/
	public static void main(String[] args){
		System.out.println("������x,y,z");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt(); 
		int[] ary={a,b,c};
		for(int i=1; i<ary.length; i++){
		      int temp = ary[i];
		      int j;
		      for(j=i-1; j>=0 && temp < ary[j]; j--){
		        if(temp < ary[j]){
		          ary[j+1] = ary[j];
		        }else{
		        	break;//�ҵ�����λ��
		        }
		      }
		      ary[j+1] = temp;//�������
		    }
	
		String s = Arrays.toString(ary);
	    System.out.println(s);
	  }


	// TODO Auto-generated method stub
		    int[] ary = {3,1,5,6,2,6,8,3};
		    //ary = selectionSort(ary);
		    //ary = insertSort(ary);
		    //  ������ary����Ϊһ���ַ���: Arrays.toString(ary);
		    //��:{1, 2, 3}->"[1, 2, 3]"
		    //String s = Arrays.toString(ary);
		    //System.out.println(s);
		  
		  /** ѡ������ */
		  public static int[] selectionSort(int[] ary){
		    for(int i=0; i<ary.length-1; i++ ){
		      for(int j=i+1; j<ary.length; j++){
		        if(ary[i]>ary[j]){
		          int temp = ary[i];
		          ary[i] = ary[j];
		          ary[j] = temp;
		        }
		      }
		    }
		    return ary;
		  }
		  /** ð������ */
		  public static int[] bubleSort(int[] ary){
		    for(int i=0; i<ary.length-1; i++){
		      for(int j=0; j<ary.length-(1+i); j++){
		        if(ary[j] > ary[j+1]){
		          int temp = ary[j];
		          ary[j] = ary[j+1];
		          ary[j+1] = temp;
		        }
		      }
		    }
		    return ary;
		  }
		  //��������
		  public static int[] insertSort(int[] ary){
		    //int[] ary = {3,1,5,6,2,6,8,3};
		    for(int i=1; i<ary.length; i++){
		      int temp = ary[i];
		      int j;
		      for(j=i-1; j>=0 && temp < ary[j]; j--){
		        //if(temp < ary[j]){
		          ary[j+1] = ary[j];
		       // }else{
		        //  break;//�ҵ�����λ��
		        //}
		      }
		      ary[j+1] = temp;//�������
		    }
		    return ary;
		  
}
}
