/*
Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element appears only once.
 The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, 
you must instead have the result be placed in the first part of the array nums. 
More formally, if there are k elements after removing the duplicates, 
then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

 */

class Solution {
    public int removeDuplicates(int[] nums) {
         int n = nums.length;

    int j = 0;
        if(n == 0 || n == 1 )
            return n;

    for (int i = 0; i < n-1; i++) 
        {
            if(nums[i] != nums[i+1])
                nums[j++]= nums[i];
        }
        nums[j++]=nums[n-1];
      return j;
    }
}
class RemoveDuplicates {

    public static void main(String[] args) {
         
        Solution s = new Solution();
        int nums [] = {1 ,2 ,2 ,2 ,45 ,67 ,89 ,89 ,89 };

        System.out.println( s.removeDuplicates(nums));
    }
}