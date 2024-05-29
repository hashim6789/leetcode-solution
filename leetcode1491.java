import java.util.Arrays;

public class leetcode1491 {
    //1491. Average Salary Excluding the Minimum and Maximum Salary
    public static void main(String[] args) {
        int[] arr = {4000,3000,1000,2000};
        double res = average(arr);
        System.out.println(res);
    }

    public static double average(int[] salary) {
        double sum = Arrays.stream(salary).sum();
        int min = Arrays.stream(salary).min().getAsInt();
        int max = Arrays.stream(salary).max().getAsInt();
        sum = sum - (max + min);
        double avg = sum / (salary.length-2);
        return avg;
    }

}
