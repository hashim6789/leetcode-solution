public class leetcode3000 {
    public static void main(String[] args) {
        int[][] arr = {{6,5},{8,6},{2,10},{8,1},{9,2},{3,5},{3,5}};
        int res = areaOfMaxDiagonal(arr);
        System.out.println(res+" ");
    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int res = 0;
        double maxDiagonelLength = 0;
        for(int i=0; i<dimensions.length; i++){
            double diagonalLength = Math.sqrt((dimensions[i][0] * dimensions[i][0]) + (dimensions[i][1] * dimensions[i][1]));
            if(maxDiagonelLength < diagonalLength || (maxDiagonelLength == diagonalLength && res < dimensions[i][0] * dimensions[i][1])){
                maxDiagonelLength = diagonalLength;
                res = dimensions[i][0] * dimensions[i][1];
            }
        }
        return res;
    }
}
