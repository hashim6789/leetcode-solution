public class leetcode1480 {
    //1480. Running Sum of 1d Array
    public static void main(String[] args) {
        int[] arr = {3,1,2,10,1};
        int[] res = runningSum(arr);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] runningSum(int[] nums) {
        int[] returningSum = new int[nums.length];
        returningSum[0] = nums[0];
        for(int i=1; i<=nums.length-1; i++){
            returningSum[i] = nums[i] + returningSum[i-1];
        }
        return returningSum;
    }
}
