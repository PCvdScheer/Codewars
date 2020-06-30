public class Printer {
    
    public static String printerError(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n =0;
        for(int i =0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
            if(sb.charAt(i) > 'm'){n+=1;}
        }
        return n + "/" + sb.length();
        
    }
}