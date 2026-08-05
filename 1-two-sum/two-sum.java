class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = nums.clone();
        Arrays.sort(arr);

        int start=0; int end=nums.length-1;
        int val1= -1, val2= -1;

        while(start<end){
            if(arr[start]+arr[end]==target){
                val1 = arr[start];
                val2 = arr[end];
                break;
            }
            else if(arr[start]+arr[end]>target){
                end--;
            }else{
                start++;
            }
        }

        int num1 = -1, num2 = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == val1 && num1 == -1){
                num1 = i;
            }
            else if(nums[i] == val2 && num2 == -1){
                num2 = i;
            }
        }

        return new int[]{num1,num2};
    }
}