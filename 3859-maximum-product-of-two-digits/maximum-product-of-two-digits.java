class Solution {
    public int maxProduct(int n) {
        int Max1 =0;
        int Max2 =2;

        while(n>0){
            int digit=n%10;

            if(digit>Max1){
                Max2=Max1;
                Max1=digit;
            }else if(digit>Max2){
                Max2=digit;
            }
            n/=10;
        }
        return Max1*Max2;
    }
}