package Questions_To_Ace_Interviews_leve1;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum {
    public static void main(String[] args) {
        int[] nums=new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums=sol(nums);
        for(int i=0 ;i < nums.length ; i++)
            System.out.println(nums[i] + " ");
    }

    static int[] sol(int[] nums) {
        for(int i=1 ; i < nums.length ; i++){
            nums[i]+=nums[i-1];
        }

        return nums;
    }
}
