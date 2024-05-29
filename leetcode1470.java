class leetcode1470{
    //1470. Shuffle the Array

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = arr.length;

        int[] res = new int[n];
        res = shuffle(arr, n/2);
        for(int i : res){
            System.out.print(i+" ");
        }


    }

    public static int[] shuffle(int[] nums, int n) {
        int n1=0, n2=n;
        int[] res = new int[2*n];
        int i=0;
        while(i<2*n){
            res[i++] = nums[n1++];
            res[i++] = nums[n2++];
        }
        return res;
    }
}