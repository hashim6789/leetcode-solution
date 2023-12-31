public class leetcode334 {
    // Increasing Triplet Subsequence
    public static boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-2;i++)
            for(int j=i+1;j<n-1;j++)
                for(int k=j+1;k<n;k++)
                    if(nums[i]<nums[j] && nums[j]<nums[k])
                        return true;

        return false;
    }
    public static void main(String[] args) {
        int[] n = {2,1,5,0,4,6};
        System.out.println(increasingTriplet(n));
    }
}
