class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int mw = 1;
        int left =0;

        for(int right =0;right<n;right++){
            while((long)nums[right]>(long)nums[left]*k){
                left++;
            }
            mw = Math.max(mw,right-left+1);
        }
        return n-mw;
        
    }
}


/*

Sort the array.

Use two pointers left and right.

While nums[right] > nums[left] * k, move left.

Track maximum window size.

Answer = n - maxWindow.
Why:
After sorting, nums[left] = min and nums[right] = max, so checking condition is easy.

TC / SC:
O(n log n) / O(1)


*/