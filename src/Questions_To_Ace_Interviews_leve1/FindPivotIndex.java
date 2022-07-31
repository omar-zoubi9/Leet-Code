package Questions_To_Ace_Interviews_leve1;

public class FindPivotIndex
{
    public static void main(String[] args) {
        int[] nums=new int[3];
        nums[0] = 2;
        nums[1] = 1;
        nums[2] = -1;
            System.out.println(sol(nums));
    }

    static int sol(int[] nums1) {
        int[] nums2 = new int[nums1.length];
        nums2[nums2.length-1]=nums1[nums2.length-1];

        if(nums1.length == 1)
            return 0;

        for(int i=0 ; i < nums1.length  ; i++){
            nums2[i]=nums1[i];
        }

        int j=nums1.length-2;
        for(int i=1 ; i < nums1.length  ; i++){
            nums1[i]+=nums1[i-1];
            nums2[j]+=nums2[j+1];
            j--;
        }

        if( nums2[1] == 0 ) return 0;
        for(int i=1 ; i < nums1.length-1  ; i++){
            if(nums1[i-1] == nums2[i+1] ){
                return i;
            }
        }
        if( nums1[nums1.length-2] == 0 ) return nums1.length-1;

        return -1;
    }
}
