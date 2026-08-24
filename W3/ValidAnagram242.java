
public class ValidAnagram242 {

public static void main(String[] args)
{
String str1="dormitory";
String str2="dirty     room";
System.out.println(solve(str1,str2));
}

public static boolean solve(String str1,String str2)
{

String s1=str1.toLowerCase();
String s2=str2.toLowerCase();
s1=s1.replaceAll("\\s+","");
s2=s2.replaceAll("\\s+", "");
int[] counts=new int[26];
for(int i=0;i<s1.length();i++)
{
    counts[s1.charAt(i)-'a']++;
}
for(int j=0;j<s2.length();j++)
{
    counts[s2.charAt(j)-'a']--;
}

for(int count:counts)
{
    if(count!=0)
    {
        return false;
    }
}

return true;

}
    
}
