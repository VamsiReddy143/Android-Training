import java.io.*;
import java.lang.*;
public class Day5pb1 {

    
    public static void main(String[] args) {
       Test o=new Test(); 
       o.withoutString("Hello there","llo");
       
    }
    
}
class Test
{
    public void withoutString(String s1,String s2)
    {  
         int n2=s2.length();
         for(int i=0;i<n2;i++)
         {
             int n1=s1.length();
             for(int j=0;j<n1;j++)
             {
                 if(s2.charAt(i)==s1.charAt(j))
                 {  
                     s1=s1.substring(0,j)+s1.substring(j+1,n1);
                     System.out.println(s1);
                     break;
                 }
             }
         }
    }   
}