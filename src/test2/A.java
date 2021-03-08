package test2;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr={22,32,12,52,99,62,30,10,20};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		int num=20;
		while(start<=end){
			if(num>arr[mid]){
				start=mid+1;
			}else if(num<arr[mid]){
				end=mid-1;
			}else{
				System.out.println("找到数字"+num+"的位子在"+(mid+1));
				break;
			}
			mid=(start+end)/2;
		}
	
}
}