class Solution {
    public int maxVowels(String s, int k) {
        int left =0;
        int right = 0;
        int result =0;
        int window =0;

        for(;right<k;right++){
            char c = s.charAt(right);
            window+=isvowel(c);
            result=Math.max(result,window);
        }
        while(right<s.length()){
            window-=isvowel(s.charAt(left++));
            window+=isvowel(s.charAt(right++));
            result=Math.max(result,window);
        }
        return result;
    }

    private int isvowel(char c){
        if(c == 'a' ||c =='e'||c =='i'||c =='o'||c =='u'){
            return 1;
        }else{
            return 0;
        }
        
    }
}