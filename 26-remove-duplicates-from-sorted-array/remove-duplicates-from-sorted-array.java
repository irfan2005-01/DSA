class Solution {
    public int removeDuplicates(int[] nums) {
        int a = 0;
        int b = 1;
        int res = 1;
        int n = nums.length;
        while(b<n){
            if(nums[b]==nums[b-1]){
                b++;
                continue;
            
            }else{
                nums[a+1]=nums[b];
                a++;
                res++;
                b++;
            }
        }return res;
        
    }
}