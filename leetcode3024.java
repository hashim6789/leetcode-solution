public class leetcode3024 {
    //3024. Type of Triangle
    public static void main(String[] args) {
        int[] arr = {3,3,3};
        String res = triangleType(arr);
        System.out.println(res);
    }

    public static String triangleType(int[] nums) {
        String res = "none";
        if(nums[0] + nums[1] > nums[2] && nums[2] + nums[1] > nums[0] && nums[0] + nums[2] > nums[1]){
            if(nums[0] == nums[1] && nums[1] == nums[2]){
                res = "equilateral";
            }else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]){
                res = "isosceles";
            }else{
                res = "scalene";
            }
        }
        return res;
    }
}
