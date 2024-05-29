
public class leetcode136 {
    //136. Single Number

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int res = singleNumber(arr);
        System.out.println(res);
    }

    public static int singleNumber(int[] nums) {
        int unique_num = 0;
        for(int i=0; i<nums.length; i++){
            unique_num ^= nums[i];
        }
        return unique_num;
    }
}
