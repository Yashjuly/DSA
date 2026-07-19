class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for (int i=1;i<nums.length;i++){
            if(nums[j]==nums[i]){
               return true;
            }else{
                j++;
            }
        }
        return false;
    }
}