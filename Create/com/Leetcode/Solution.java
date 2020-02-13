package com.Leetcode;

class Solution {
    public static void main(String[] args){
        int[] nums={5,6,4,5,5,5,6,4,5,5,5,5,5,1,1,1,2,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int candidate = nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
                count=1;
            }
            else if(candidate==nums[i]) {
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}