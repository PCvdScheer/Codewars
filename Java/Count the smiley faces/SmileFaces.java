import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      
      int c = 0;
      
      for(int i = 0; i < arr.size(); i++){
          StringBuilder sb = new StringBuilder(arr.get(i));
          if(
          sb.length() == 2             
          ){
          
            System.out.println(sb);
            if(sb.charAt(0) == ':' | sb.charAt(0) == ';' && sb.charAt(1) == ')' | sb.charAt(1) == 'D'){c +=1;}
          }
          else if(
          sb.length() == 3
          ){
          
            System.out.println(sb);
            if(sb.charAt(0) == ':' | sb.charAt(0) == ';' && sb.charAt(1) == '-' | sb.charAt(1) == '~' && sb.charAt(2) == ')' | sb.charAt(2) == 'D'){c +=1;}
          }
      }
      
      
      
      return c;
  }
}