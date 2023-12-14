public class leetcode26 {
    //Remove Duplicates from Sorted Array
    public static int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1])
                nums[count++] = nums[i+1];
            else
                continue;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
}
