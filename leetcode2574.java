public class leetcode2574 {
    //2574. Left and Right Sum Differences
    public static void main(String[] args) {
        int[] arr = {10,4,8,3};
        int[] res = leftRightDifference(arr);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i] + " ");
    }
    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] res = new int[nums.length];

        leftSum[0] = 0;
        for(int i=1; i<leftSum.length; i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }

        rightSum[nums.length-1] = 0;
        for(int i=nums.length-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }

        for(int i=0; i<nums.length; i++){
            res[i] = Math.abs(rightSum[i] - leftSum[i]);
        }
        return res;
    }
}
