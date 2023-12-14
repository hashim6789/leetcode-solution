public class leetcode35 {
    //Search Insert Position
    public static int searchInsert(int[] nums, int target) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                return count;
            }else if( nums[i] < target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 3;
        int res = searchInsert(nums, target);
        System.out.println(res);
    }
}
