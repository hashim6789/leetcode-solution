public class leetcode1486 {
    //1486. XOR Operation in an Array
    public static void main(String[] args) {
        int n = 5, start = 0;
        int res = xorOperation(n, start);
        System.out.println(res);
    }
    public static int xorOperation(int n, int start) {        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = start + 2 * i;
        }
        int xor = arr[0];
        for(int i=1; i<n; i++){
            xor ^= arr[i];
        }
        return xor;
    }
}
