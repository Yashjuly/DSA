class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap <Integer,Boolean> visited =  new HashMap<>();
        int Maxlongest=0;
        
        for(int i : nums){
         visited.put(i, Boolean.FALSE);
        }

        for(int num : nums){
            int currentLongest =1;
            int currentnum= num;
            visited.put(currentnum, true);

            int nextnum = currentnum+1;
            while (visited.containsKey(nextnum) && visited.get(nextnum) == false){
                currentLongest++;
                visited.put(nextnum,Boolean.TRUE);
                nextnum ++;
            }

            int prevnum = currentnum-1;
            while (visited.containsKey(prevnum) && visited.get(prevnum) == false){
                currentLongest++;
                visited.put(prevnum,Boolean.TRUE);
                prevnum--;
            }
            if(currentLongest>Maxlongest){
                Maxlongest = currentLongest;
            }
        }

        return Maxlongest;
    }
}