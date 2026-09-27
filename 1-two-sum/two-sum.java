class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

      for(int i=0;i< nums.length;i++){
        int remn = target-nums[i];
        if(hm.containsKey(remn)){
            int[] arr ={hm.get(remn),i};
            return arr;
        }
        else{
            hm.put(nums[i],i);
        }

      }
              return null;
    }
}