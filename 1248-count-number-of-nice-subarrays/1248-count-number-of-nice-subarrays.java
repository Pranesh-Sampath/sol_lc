class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left=0;
        int odd=0;
        int count=0;
        int ans=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]%2!=0){
            odd++;
            count=0;;
        }
        while(odd==k){
            count++;
            if(nums[left]%2!=0){
                odd--;
            }
            left++;
        }
        ans+=count;
       }
      return ans;
        
    }
}