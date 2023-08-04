package Arrays;

public class QuickAlternatePositiveAndNegativeSol {
		
	public static void main(String[] args) {
		
	int [] a = {-4,7,8,-9,67,8,-3,6,-2,78,-5,87,-89};
		
	 int [] t =  rearrangeArray(a);
	 
	 for(int i =0;i<t.length;i++)
	 {
		 System.out.println(t[i]);
	 }
	   	   
	}
	    public static int[] rearrangeArray(int[] nums) {
	        int pos=0,neg=1;
	        
	        int ans[]=new int[nums.length];
	        
	       for(int i=0;i<nums.length;i++){
	    	   
	           if(nums[i]>0){
	               ans[pos]=nums[i];
	               pos+=2;
	           }
	           else{
	               ans[neg]=nums[i];
	               neg+=2;
	           }           
	       }
	       return ans;
	    }
	}


