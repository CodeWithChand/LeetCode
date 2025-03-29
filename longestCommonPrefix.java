public class longestCommonPrefix {
    public String commonPrefix(String[] str)
    {
        if (str.length==0)
        {
            return "";
        }
        String prefix=str[0];
        for(int i=1;i<str.length;i++)
        {
            while(str[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty())
                {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args)
    {
        String[] strs=new String[]{"flower","flow","fly"};
        longestCommonPrefix obj=new longestCommonPrefix();
        String result= obj.commonPrefix(strs);
        System.out.println(result);
    }
}
