public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int j=1,count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]){
                nums[j++]=nums[i+1]; 
                count++;
            }
        }
        return count;
    }
}