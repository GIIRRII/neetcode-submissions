class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int [] output = new int[nums.length]; 
        for(int i = 0 ;i<nums.length; i++){
            product = product * nums[i];
            
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) {
                output[i] = product/nums[i]; 
            } else {
                int prod = 1;
                for(int j=0; j<nums.length; j++) {
                    if(i!=j){
                     prod = prod*nums[j];
                    }        
                }
                output[i] = prod;
            }
        }
        return output;

    }
}  
