class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fl =-1;
        int ll = -1;

        for(int i =0;i<nums.length;i++){
            if(nums[i]==target && fl == -1){
                fl=i;
                ll=i;
            }else if(nums[i]==target && ll<i){
                ll=i;
            }
        }
        return new int[]{fl, ll};
    }
}