import java.lang.*;
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        int[] myIntArray = new int[3];
        
        double hours;
        
        if(v2>v1){
          hours = (double) g/(v2-v1);
        }else {return null;}
        
        System.out.println("amount of hours: " + hours);
        double seconds = (double) hours*3600;
        System.out.println("amount of seconds: " + seconds);
        
        
        
        int h = 0;
        int m = 0;
        
        if(seconds/3600 >= 1){
            h = (int) seconds/3600;
            System.out.println("amount of hours calc: " + seconds/3600);
            seconds -= (int) (seconds/3600)*3600;
        }
       
        if(seconds/60 >= 1){
            m = (int) seconds/60;
            seconds -= (int) (seconds/60)*60;
        }
        
        System.out.println("amount of seconds: " + seconds);
        
        myIntArray[0] = (int) h;
        myIntArray[1] = (int) m;
        myIntArray[2] = (int) seconds;
    
        System.out.println("hours: "+ myIntArray[0] + " minutes: "+ myIntArray[1] + " seconds: " + myIntArray[2]);
    
        return myIntArray;  
    } 
}