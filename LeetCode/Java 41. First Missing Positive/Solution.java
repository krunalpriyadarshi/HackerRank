// 41. First Missing Positive
// url: https://leetcode.com/problems/first-missing-positive/

class Solution {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n; ++i){
            while(nums[i]>0 && nums[i]<=n&& nums[nums[i]-1]!= nums[i]) 
            {
                int temp =nums[nums[i]-1];
                nums[nums[i]-1]= nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0;i<n; ++i)
        {
            if(nums[i] !=i+1){
                return i+1;
            }
        }
        return n+1;
    }

    public static void main(String[] args) {
        Solution sol= new Solution();
        int[] nums= {4, 3,2 ,1};
        System.out.println(sol.firstMissingPositive(nums));
    }
}
