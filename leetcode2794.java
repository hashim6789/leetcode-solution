import java.util.Arrays;

public class leetcode2794 {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3};
        int[] res = numberGame(arr);

        for(int i : res){
            System.out.print(i+" ");
        }
    }

    public static int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        int i=0;
        int j=0;
        while(i <= nums.length-1){
            int alice = nums[i++];
            int bob = nums[i++];
            arr[j++] = bob;
            arr[j++] = alice;
        }

        return arr;
    }
}