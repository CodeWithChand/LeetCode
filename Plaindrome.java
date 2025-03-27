public class Plaindrome {
    public static boolean isPalindrome(int num){
        int rem,sum=0,temp;
        temp=num;
        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(sum==temp)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args)
    {
        int num=121;
        System.out.println(isPalindrome(num));
    }
}



