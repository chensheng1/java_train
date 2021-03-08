package test2;

public class coinc {
	public static int compareTo(int[] coins, int[] left, int[] right) {  
        
        int leftTotal = 0;  
        int rightTotal = 0;  
        int fakeCoin = 0;  
        int coinsSize = 0;  
          
        if (coins.length % 2 == 0) {  
            coinsSize = coins.length/2;         //将现在的硬币分成两半  
            System.arraycopy(coins, 0, left, 0, coinsSize);     //前一半硬币放到left  
            for (int i = 0; i < coinsSize; i++) {  
                leftTotal = leftTotal + left[i];        //前一半硬币的总重量  
            }  
            System.arraycopy(coins, coinsSize, right, 0, coinsSize);        //后一半硬币放到right  
            for (int j = 0; j < coinsSize; j++) {  
                rightTotal = rightTotal + right[j];         //后一半硬币的总重量  
            }  
        }  
        //比较right和left两边的硬币重量  
        if (leftTotal < rightTotal && coinsSize != 1) {            
            coins = right;  
            int[] right_1 = new int[coinsSize/2];  
            int[] left_1 = new int[coinsSize/2];  
            right = right_1;        //动态改变数组大小，减治后硬币减半  
            left = left_1;  
            System.arraycopy(coins, 0, left, 0, coinsSize/2);  
            System.arraycopy(coins, coinsSize/2, right, 0, coinsSize/2);  
        } else if (leftTotal > rightTotal && coinsSize != 1) {  
            coins = left;  
            int[] right_1 = new int[coinsSize/2];  
            int[] left_1 = new int[coinsSize/2];  
            right = right_1;  
            left = left_1;  
            System.arraycopy(coins, 0, left, 0, coinsSize/2);  
            System.arraycopy(coins, coinsSize/2, right, 0, coinsSize/2);  
        }  
        if (left.length != 1 && right.length != 1 && fakeCoin == 0) {  
            fakeCoin = compareTo(coins, left, right);    //递归调用，如果不令“fakeCoin=”最终返回会为0  
        }  
        if (left.length == 1 && right.length == 1 && coinsSize == 2) {  
            if (left[0] < right[0]) {  
                fakeCoin = right[0];  
            } else if (left[0] == right[0]){  
                System.out.println(left[0] + "and" + right[0]);  
            } else {  
                fakeCoin = left[0];  
            }  
        }  
        return fakeCoin;  
    }  
    public static void main(String[] args) {  
        int[] coins = {1, 1, 1, 2, 1, 1, 1, 1};  
        int[] left = new int[4];  
        int[] right = new int[4];  
        int flag = 0;  
        int location = compareTo(coins, left, right);  
        for (int i = 0; i < coins.length; i++) {  
            flag++;  
            if (coins[i] == location) {  
                System.out.println("第" + flag + "枚硬币为假币！");  
            }  
        }  
    }  
  
}  

