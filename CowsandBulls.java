/*You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is.
Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in
both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). 
Your friend will use successive guesses and hints to eventually derive the secret number.*/

public class Solution {
    public String getHint(String secret, String guess) {
        char[] a=secret.toCharArray();
        char[] b=guess.toCharArray();
        int i=0;
        int j=0;
        int bulls=0;
        int cows=0;
// counting and removing the bulls first i.e., same digits at exact position
        while(i<a.length&&j<b.length)
        {
              if(a[i]==b[j])
              {
                  if(i==j)
                  {
                     bulls+=1;
                     a[i]='\0';
                     b[j]='\0';
                    
                  }
              }
              i++;
              j++;
        }
       // checking for cows if there are any    
       for(  i=0;i<a.length;i++)
       
           for( j=0;j<b.length;j++)
           
              
              if(a[i]!='\0'||b[j]!='\0')
              
                if(a[i]==b[j])
                {
                
                  cows+=1;  
                  a[i]='\0';
                  b[j]='\0';
                    
                }
          
           return ""+bulls+"A"+cows+"B";
            
         
        
    }
}
