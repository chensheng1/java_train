package test3;

import java.util.ArrayList;
import java.util.List;

public class contant_1 {
      public static void main(String[] arg){
    	 contant_1 cs =new contant_1();
    	 cs.Insert("abcab");
    	 System.out.println(cs.FirstAppearingOnce());
      }
 
   List<String> list=new ArrayList<String>();
    public void Insert(String str1){ 
    	for(int i=0;i<=str1.length();i++){
    		String ch=str1.substring(i-1,i);
    	    list.add(ch); 
    	}
   } 
    	 //return the first appearence once char in current stringstream 
   public String FirstAppearingOnce() { 
    	   int len = list.size(); 
    	   String  c ="#";
    	    for(int i=0;i<len;i++){ 
	    	     int count =0; 
	    	    c = list.get(i); 
	    	   for(int j=0;j<len;j++){ 
			    	    if(list.get(j)==list.get(i)){ 
			    	     count++;
			    	    }
			    	     if(count>1){ 
			    	    	 continue; 
			            } 
			   }
			   if(count==1){ 
			    	return c; 
			   }else{ 
			    	 c="#"; 
			   } 
    	 }
    	    return c;
   } 	    
}
 

