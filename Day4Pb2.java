/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author user
 */
public class Day4Pb2 {

    
    public static void main(String[] args) {
        String s="hello";
        char c=s.charAt(0);
        int n=s.length();
        int count=1,high=1;
        for(int i=0;i<n-1;i++)
        {
            char c1=s.charAt(i);System.out.println("i="+i+",c1="+c1);
            char c2=s.charAt(i+1);
            if(c1==c2)
            {
                count++;
            }
            else
            {
                if(count>high)
                {   
                    c=s.charAt(i);
                    high=count;
                    count=1;
                }
            }
        }
        System.out.println(high);
        
    }
    
}
