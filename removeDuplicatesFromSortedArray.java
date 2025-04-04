public class removeDuplicatesFromSortedArray {
    public int removeLogic(int[] nums)
    {
        if(nums.length==0)
        {
            return 0;
        }
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j] !=nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args)
    {
        int[] nums=new int[]{0,1,1,2,3,3,4,5,6,6};
        removeDuplicatesFromSortedArray obj= new removeDuplicatesFromSortedArray();
        int result=obj.removeLogic(nums);
        for(int i =0;i<result;i++) {
            System.out.println(nums[i]);
        }
    }
}
