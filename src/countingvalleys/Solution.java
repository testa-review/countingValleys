/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingvalleys;

/**
 *
 * @author sergio
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s= "UD";
        int n = s.length();
        
        System.out.println(countingValleys(n, s));
    }
    
    
    static int countingValleys(int n, String s) {
        int result=0; // numero de valles        
        int deep = 0; // numero de pasos recorridos por encima del nivel del mar, 0: a nivel, >0, por encima, <0, por debajo 
        
        char U = 'U';
        char D = 'D';
        
        
        
        for (int i = 0; i < s.length()-1; i++) {
            
            if(s.charAt(i)==U)
            {                         
                deep++;
                //System.out.println("U: "+deep);
            }
            else
            {
                deep--;
                //System.out.println("D: "+deep);
            }
            
            
            if(deep==-1 && s.charAt(i+1)==U)
            {   //System.out.println("result++");
                result++;
            }
            
        }
        
        return result;

    }

}
