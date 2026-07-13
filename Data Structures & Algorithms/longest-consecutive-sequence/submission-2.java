class Solution {
    public int longestConsecutive(int[] nums) {
        
        List<Integer> longestSequence = new ArrayList<>();
        Arrays.sort(nums);
        
        int maxLength = 1; int currentLength = 1;
        if(nums == null || nums.length==0){
            return 0;
        }
        
        for(int j = 1; j < nums.length; j++){
            if(nums[j]==nums[j-1]){
                continue;
            }
            if(nums[j] - nums[j-1] == 1){
                currentLength +=1;
            } else  {
            maxLength = Math.max(maxLength, currentLength);
            currentLength = 1;
            }
        }
            return Math.max(maxLength, currentLength);
 
        
    }
}
