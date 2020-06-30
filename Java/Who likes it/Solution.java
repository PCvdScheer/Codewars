class Solution {
    public static String whoLikesIt(String... names) {
        
        int n = names.length;
        int m = n-2;
        
        System.out.println(n);
        
        if(n == 0){return "no one likes this";}
        else if(n ==1){return names[n-1] + " likes this";}
        else if(n==2){return names[0] + " and " + names[1] + " like this";}
        else if(n==3){return names[0] + ", " + names[1] + " and " + names[2] + " like this";}
        else{return names[0] + ", " + names[1] + " and " + m +  " others like this";}
      
    }
}