package PrintSubArrayInJava;
public class PrintSubArr {
    public static void printSubarray(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + "  ");
                    sum += nums[k];
                    if(maxSum < sum) {
                        maxSum = sum;
                    }
                    if(minSum > sum) {
                        minSum = sum;
                    }
                }
                System.out.print(" = " + sum);
                
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maximum sum : " + maxSum);
        System.out.println("minimum sum : " + minSum);
        System.out.println(total);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        printSubarray(nums);
    }
}
