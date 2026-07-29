class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min =1;
        int max = 0;
        for( int n : piles){
            max=Math.max(max,n);
        }
        while(min <max){
            int mid=min+(max-min)/2;
            if(caneat(piles,h,mid)){
                max =mid;
            }else{
                min =mid+1;
            }
        }
        return min;
       
    }

    public boolean caneat(int[] piles,int h,int mid){
        int hour =0 ;
        for(int n : piles){
            hour += (n + mid - 1) / mid;
        }
        return hour<=h;
    }
}