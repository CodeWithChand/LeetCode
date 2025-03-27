import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] num, int target) {
        for(int i=0;i<num.length;i++)
        {
            for(int j=1;j<num.length;j++)
            {
                if(num[i]+num[j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args)
    {
        int[] num;
        num = new int[]{7, 2, 13, 15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(num,target)));
    }
}
