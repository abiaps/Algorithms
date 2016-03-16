/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.*/

public class Solution {
    public boolean isPalindrome(String s) {
       
      String news=s.replaceAll("[^a-zA-Z0-9]","");
     
      StringBuffer sb=new StringBuffer(news);
      String rev=sb.reverse().toString();
      news=news.toLowerCase();
      rev=rev.toLowerCase();
     
      if(news.equals(rev))
      return true;
      else
      return false;
    }
}
