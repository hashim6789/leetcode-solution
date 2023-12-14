public class leetcode283 {
    //Move Zeroes

    public static void moveZeroes(int[] nums) {
        int position = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[position] = nums[i];
                position++;
            }
        }
            while (position < nums.length) {
                nums[position++] = 0;
            }

        for( int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,0,0,3,12};

        moveZeroes(nums);

    }
    
}
