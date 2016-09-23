import java.io.*;
import java.lang.*;
import java.util.Arrays;
public class Day5pb2 
{
    public static void main(String[] args) {
     
        TestSolution ob=new TestSolution();
        ob.diff(4,2,6);
        
    }
    
}
class TestSolution
{
    public void diff(int a1,int b1,int c1)
    {
        int a[]=new int[3];
        a[0]=a1;a[1]=b1;a[2]=c1;
        Arrays.sort(a);
        if(((a[2]-a[1])==(a[1]-a[0]))&&(((a[2]-a[1])%2)==0))  System.out.println("True");
        else System.out.println("False");
    }
}
