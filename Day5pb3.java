
public class Day5pb3 {

    
    public static void main(String[] args) {
       TestCase ob=new TestCase();
       ob.repeat("99",",",3);
    }
}
class TestCase
{
    public void repeat(String s1,String s2,int n)
    {   String s=new String();
        for(int i=n;i>=1;i--)
        {
            s=s+s1;
            if(i==1)
                break;
            else
            s=s+s2;
        }
        System.out.println(s);
    }
}