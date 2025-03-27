public class romanToInteger {
    public int getValue(char c)
    {
        switch (c)
        {
            case 'I':return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }

    }
    public int romanToInt(String s)
    {
        int ans=0,prev=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int num=getValue(s.charAt(i));
            if(num<prev)
            {
                ans=ans-num;
            }
            else
            {
                ans=num+ans;
            }
            prev=num;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String s ="ILIX";
        romanToInteger obj=new romanToInteger();
        int result= obj.romanToInt(s);
        System.out.println(result);
    }
}
