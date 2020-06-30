class Solution {
  public static String camelCase(String input) {
  
  StringBuilder sb = new StringBuilder(input);
  StringBuilder sb1 = new StringBuilder(); 
  for(int i=0; i<sb.length(); i++){
  
        System.out.println("String 1: " + String.valueOf(sb.charAt(i)) + " string 2: "+ String.valueOf(sb.charAt(i)).toUpperCase());
        if(String.valueOf(sb.charAt(i)).equals(String.valueOf(sb.charAt(i)).toUpperCase()))
        {
        System.out.println(" "+ String.valueOf(sb.charAt(i)));
        sb1.append( " ");
        sb1.append(String.valueOf(sb.charAt(i)));
        } 
        else{
        System.out.println(String.valueOf(sb.charAt(i)));
        sb1.append(sb.charAt(i));
        } 
  }
    return sb1.toString();
  }
}